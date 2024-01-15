/*
 * Copyright (c) 2022 KCloud-Platform-Alibaba Author or Authors. All Rights Reserved.
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

package org.laokou.admin.command.definition.query;

import lombok.RequiredArgsConstructor;
import org.laokou.admin.dto.definition.DefinitionListQry;
import org.laokou.admin.dto.definition.clientobject.DefinitionCO;
import org.laokou.admin.gatewayimpl.rpc.DefinitionsFeignClient;
import org.laokou.common.i18n.dto.Datas;
import org.laokou.common.i18n.dto.Result;
import org.springframework.stereotype.Component;

/**
 * 查询流程列表执行器.
 * @author laokou
 */
@Component
@RequiredArgsConstructor
public class DefinitionListQryExe {

	private final DefinitionsFeignClient definitionsFeignClient;

	/**
	 * 执行查询流程列表.
	 * @param qry 查询流程列表参数
	 * @return 流程列表
	 */
	public Result<Datas<DefinitionCO>> execute(DefinitionListQry qry) {
		return definitionsFeignClient.list(qry);
	}

}
