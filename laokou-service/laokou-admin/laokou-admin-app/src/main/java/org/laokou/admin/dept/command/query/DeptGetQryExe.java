/*
 * Copyright (c) 2022-2024 KCloud-Platform-IoT Author or Authors. All Rights Reserved.
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

package org.laokou.admin.dept.command.query;

import lombok.RequiredArgsConstructor;
import org.laokou.admin.dept.convertor.DeptConvertor;
import org.laokou.admin.dept.dto.DeptGetQry;
import org.laokou.admin.dept.dto.clientobject.DeptCO;
import org.laokou.admin.dept.gatewayimpl.database.DeptMapper;
import org.laokou.common.i18n.dto.Result;
import org.springframework.stereotype.Component;

/**
 * 查看部门请求执行器.
 *
 * @author laokou
 */
@Component
@RequiredArgsConstructor
public class DeptGetQryExe {

	private final DeptMapper deptMapper;

	public Result<DeptCO> execute(DeptGetQry qry) {
		return Result.ok(DeptConvertor.toClientObject(deptMapper.selectById(qry.getId())));
	}

}