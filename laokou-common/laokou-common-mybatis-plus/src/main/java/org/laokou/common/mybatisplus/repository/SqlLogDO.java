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

package org.laokou.common.mybatisplus.repository;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import static org.laokou.common.i18n.common.DatasourceConstant.BOOT_SYS_SQL_LOG;

/**
 * @author laokou
 */
@Data
@TableName(BOOT_SYS_SQL_LOG)
@Schema(name = "SqlLogDO", description = "SQL日志")
public class SqlLogDO extends BaseDO {

	@Schema(name = "appName", description = "应用名称")
	private String appName;

	@Schema(name = "sql", description = "查询语句")
	private String sql;

	@Schema(name = "costTime", description = "消耗时间")
	private Long costTime;

}
