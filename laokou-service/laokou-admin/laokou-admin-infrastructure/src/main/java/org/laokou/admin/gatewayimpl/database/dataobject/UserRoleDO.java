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

package org.laokou.admin.gatewayimpl.database.dataobject;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author laokou
 */
@Data
@Schema(name = "UserRoleDO", description = "用户角色")
public class UserRoleDO implements Serializable {

	@Serial
	private static final long serialVersionUID = -3464670573494984526L;

	@TableId(type = IdType.INPUT)
	@Schema(name = "id", description = "ID")
	private Long id;

	@Schema(name = "roleId", description = "角色ID")
	private Long roleId;

	@Schema(name = "userId", description = "用户ID")
	private Long userId;

}
