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

package org.laokou.flowable.command.definition;

import com.baomidou.dynamic.datasource.annotation.DS;
import lombok.RequiredArgsConstructor;
import org.flowable.engine.RepositoryService;
import org.flowable.engine.repository.ProcessDefinition;
import org.laokou.common.i18n.common.exception.FlowException;
import org.laokou.common.i18n.dto.Result;
import org.laokou.flowable.dto.definition.DefinitionActivateCmd;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import static org.laokou.flowable.common.Constant.FLOWABLE;

/**
 * @author laokou
 */
@Component
@RequiredArgsConstructor
public class DefinitionActiveCmdExe {

	private final RepositoryService repositoryService;

	@DS(FLOWABLE)
	public Result<Boolean> execute(DefinitionActivateCmd cmd) {
		String definitionId = cmd.getDefinitionId();
		ProcessDefinition definition = repositoryService.createProcessDefinitionQuery()
			.processDefinitionId(definitionId)
			.singleResult();
		if (definition.isSuspended()) {
			return Result.of(activate(definitionId));
		}
		else {
			throw new FlowException("激活失败，流程已激活");
		}
	}

	@Transactional(rollbackFor = Exception.class)
	public Boolean activate(String definitionId) {
		// 激活
		repositoryService.activateProcessDefinitionById(definitionId, true, null);
		return true;
	}

}
