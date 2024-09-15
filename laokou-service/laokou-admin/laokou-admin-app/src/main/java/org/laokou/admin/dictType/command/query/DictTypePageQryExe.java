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

package org.laokou.admin.dictType.command.query;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.laokou.admin.dictType.convertor.DictTypeConvertor;
import org.laokou.admin.dictType.dto.DictTypePageQry;
import org.laokou.admin.dictType.dto.clientobject.DictTypeCO;
import org.laokou.admin.dictType.gatewayimpl.database.DictTypeMapper;
import org.laokou.admin.dictType.gatewayimpl.database.dataobject.DictTypeDO;
import org.laokou.common.i18n.dto.Page;
import org.laokou.common.i18n.dto.Result;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/**
 * 分页查询字典类型请求执行器.
 *
 * @author laokou
 */
@Component
@RequiredArgsConstructor
public class DictTypePageQryExe {

	private final DictTypeMapper dictTypeMapper;

	private final Executor executor;

	@SneakyThrows
	public Result<Page<DictTypeCO>> execute(DictTypePageQry qry) {
		CompletableFuture<List<DictTypeDO>> c1 = CompletableFuture
			.supplyAsync(() -> dictTypeMapper.selectPageByCondition(qry.index()), executor);
		CompletableFuture<Long> c2 = CompletableFuture.supplyAsync(() -> dictTypeMapper.selectCountByCondition(qry),
				executor);
		return Result
			.ok(Page.create(c1.get(30, TimeUnit.SECONDS).stream().map(DictTypeConvertor::toClientObject).toList(),
					c2.get(30, TimeUnit.SECONDS)));
	}

}
