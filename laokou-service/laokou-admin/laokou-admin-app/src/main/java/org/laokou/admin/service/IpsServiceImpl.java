/*
 * Copyright (c) 2022-2024 KCloud-Platform-Alibaba Author or Authors. All Rights Reserved.
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

package org.laokou.admin.service;

import lombok.RequiredArgsConstructor;
import org.laokou.admin.api.IpsServiceI;
import org.laokou.admin.command.ip.IpDeleteCmdExe;
import org.laokou.admin.command.ip.IpInsertCmdExe;
import org.laokou.admin.command.ip.IpRefreshCmdExe;
import org.laokou.admin.command.ip.query.IpListQryExe;
import org.laokou.admin.dto.ip.IpDeleteCmd;
import org.laokou.admin.dto.ip.IpInsertCmd;
import org.laokou.admin.dto.ip.IpListQry;
import org.laokou.admin.dto.ip.IpRefreshCmd;
import org.laokou.admin.dto.ip.clientobject.IpCO;
import org.laokou.common.i18n.dto.Datas;
import org.laokou.common.i18n.dto.Result;
import org.springframework.stereotype.Service;

/**
 * IP管理.
 * @author laokou
 */
@Service
@RequiredArgsConstructor
public class IpsServiceImpl implements IpsServiceI {

	private final IpInsertCmdExe ipInsertCmdExe;

	private final IpDeleteCmdExe ipDeleteCmdExe;

	private final IpListQryExe ipListQryExe;

	private final IpRefreshCmdExe ipRefreshCmdExe;

	/**
	 * 新增IP
	 * @param cmd 新增IP参数
	 * @return 新增IP
	 */
	@Override
	public Result<Boolean> insert(IpInsertCmd cmd) {
		return ipInsertCmdExe.execute(cmd);
	}

	/**
	 * 根据IP删除IP
	 * @param cmd 根据IP删除IP参数
	 * @return 删除结果
	 */
	@Override
	public Result<Boolean> deleteById(IpDeleteCmd cmd) {
		return ipDeleteCmdExe.execute(cmd);
	}

	/**
	 * 查询IP列表
	 * @param qry 查询IP列表参数
	 * @return IP列表
	 */
	@Override
	public Result<Datas<IpCO>> list(IpListQry qry) {
		return ipListQryExe.execute(qry);
	}

	/**
	 * 刷新IP至Redis
	 * @param cmd 刷新IP至Redis参数
	 * @return 刷新结果
	 */
	@Override
	public Result<Boolean> refresh(IpRefreshCmd cmd) {
		return ipRefreshCmdExe.execute(cmd);
	}

}
