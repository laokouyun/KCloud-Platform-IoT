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

package org.laokou.admin.gatewayimpl.rpc.fallback;

import org.laokou.admin.dto.definition.DefinitionListQry;
import org.laokou.admin.dto.definition.clientobject.DefinitionCO;
import org.laokou.admin.gatewayimpl.rpc.DefinitionsFeignClient;
import org.laokou.common.i18n.common.exception.FeignException;
import org.laokou.common.i18n.dto.Datas;
import org.laokou.common.i18n.dto.Result;
import org.springframework.web.multipart.MultipartFile;

/**
 * 定义流程.
 *
 * @author laokou
 */
public class DefinitionsFeignClientFallback implements DefinitionsFeignClient {

	/**
	 * 新增流程.
	 * @param file 文件
	 * @return 新增结果
	 */
	@Override
	public Result<Boolean> insert(MultipartFile file) {
		throw new FeignException("新增流程失败");
	}

	/**
	 * 查询任务流程列表.
	 * @param qry 查询任务流程列表参数
	 * @return 任务流程列表
	 */
	@Override
	public Result<Datas<DefinitionCO>> list(DefinitionListQry qry) {
		return Result.of(Datas.of());
	}

	/**
	 * 挂起流程.
	 * @param definitionId 定义ID
	 * @return 挂起结果
	 */
	@Override
	public Result<Boolean> suspend(String definitionId) {
		throw new FeignException("挂起流程失败");
	}

	/**
	 * 激活流程.
	 * @param definitionId 定义ID
	 * @return 激活结果
	 */
	@Override
	public Result<Boolean> activate(String definitionId) {
		throw new FeignException("激活流程失败");
	}

	/**
	 * 查看流程图.
	 * @param definitionId 定义ID
	 * @return 流程图
	 */
	@Override
	public Result<String> diagram(String definitionId) {
		throw new FeignException("查看流程图失败");
	}

	/**
	 * 删除流程.
	 * @param deploymentId 定义ID
	 * @return 删除结果
	 */
	@Override
	public Result<Boolean> delete(String deploymentId) {
		throw new FeignException("删除流程失败");
	}

}