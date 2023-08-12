/*
 * Copyright (c) 2022 KCloud-Platform-Alibaba Authors. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.laokou.admin.gatewayimpl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.annotation.DSTransactional;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.laokou.admin.convertor.UserConvertor;
import org.laokou.admin.domain.gateway.UserGateway;
import org.laokou.admin.domain.user.User;
import org.laokou.admin.gatewayimpl.database.UserMapper;
import org.laokou.admin.gatewayimpl.database.UserRoleMapper;
import org.laokou.admin.gatewayimpl.database.dataobject.UserDO;
import org.laokou.admin.gatewayimpl.database.dataobject.UserRoleDO;
import org.laokou.common.core.utils.CollectionUtil;
import org.laokou.common.mybatisplus.utils.BatchUtil;
import org.laokou.common.mybatisplus.utils.DynamicTableContextHolder;
import org.laokou.common.mybatisplus.utils.IdUtil;
import org.laokou.common.security.utils.UserUtil;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.laokou.admin.common.Constant.DEFAULT_SOURCE;
import static org.laokou.common.core.constant.Constant.SHARDING_SPHERE;

/**
 * @author laokou
 */
@Slf4j
@Component
@RequiredArgsConstructor
public class UserGatewayImpl implements UserGateway {

	private final UserMapper userMapper;

	private final PasswordEncoder passwordEncoder;

	private final BatchUtil batchUtil;

	private final UserRoleMapper userRoleMapper;

	@Override
	@DSTransactional(rollbackFor = Exception.class)
	@DS(SHARDING_SPHERE)
	public Boolean insert(User user) {
		boolean insertFlag;
		try {
			UserDO userDO = getInsertUserDO(user);
			insertFlag = userMapper.insert(userDO) > 0;
			DynamicTableContextHolder.set(DEFAULT_SOURCE);
			insertBatch(userDO.getId(), user.getRoleIds());
		}
		catch (Exception e) {
			log.error("错误信息：{}", e.getMessage());
			throw e;
		}
		finally {
			DynamicTableContextHolder.clear();
		}
		return insertFlag;
	}

	@Override
	@Transactional(rollbackFor = Exception.class)
	@DS(SHARDING_SPHERE)
	public Boolean update(User user) {
		boolean updateFlag, updateBatchFlag;
		try {
			UserDO userDO = getUpdateUserDO(user);
			updateFlag = userMapper.updateUser(userDO) > 0;
			DynamicTableContextHolder.set(DEFAULT_SOURCE);
			// 删除中间表
			updateBatchFlag = deleteUserRole(userDO);
			insertBatch(userDO.getId(), user.getRoleIds());
		}
		catch (Exception e) {
			log.error("错误信息：{}", e.getMessage());
			throw e;
		}
		finally {
			DynamicTableContextHolder.clear();
		}
		return updateFlag && updateBatchFlag;
	}

	private Boolean deleteUserRole(UserDO userDO) {
		List<UserRoleDO> userRoles = userRoleMapper.selectList(Wrappers.lambdaQuery(UserRoleDO.class)
				.eq(UserRoleDO::getUserId, userDO.getId()).select(UserRoleDO::getId));
		if (CollectionUtil.isNotEmpty(userRoles)) {
			return userRoleMapper.deleteBatchIds(userRoles.stream().map(UserRoleDO::getId).toList()) > 0;
		}
		return false;
	}

	private UserDO getInsertUserDO(User user) {
		UserDO userDO = UserConvertor.toDataObject(user);
		userDO.setPassword(passwordEncoder.encode(userDO.getPassword()));
		userDO.setTenantId(UserUtil.getTenantId());
		return userDO;
	}

	private UserDO getUpdateUserDO(User user) {
		UserDO userDO = UserConvertor.toDataObject(user);
		userDO.setEditor(UserUtil.getUserId());
		userDO.setVersion(userRoleMapper.getVersion(userDO.getId()));
		return userDO;
	}

	private void insertBatch(Long userId, List<Long> roleIds) {
		if (CollectionUtil.isEmpty(roleIds)) {
			return;
		}
		List<UserRoleDO> list = new ArrayList<>(roleIds.size());
		for (Long roleId : roleIds) {
			UserRoleDO userRoleDO = new UserRoleDO();
			userRoleDO.setId(IdUtil.defaultId());
			userRoleDO.setUserId(userId);
			userRoleDO.setRoleId(roleId);
			list.add(userRoleDO);
		}
		batchUtil.insertBatch(list, userRoleMapper::insertBatch);
	}

}
