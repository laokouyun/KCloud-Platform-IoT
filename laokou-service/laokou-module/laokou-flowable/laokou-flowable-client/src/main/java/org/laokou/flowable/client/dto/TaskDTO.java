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
package org.laokou.flowable.client.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * @author laokou
 */
@Data
public class TaskDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = -3817507884449344739L;

	@NotNull(message = "显示页码不为空")
	private Integer pageNum;

	@NotNull(message = "显示条数不为空")
	private Integer pageSize;

	private String processName;

	@NotNull(message = "用户编号不为空")
	private Long userId;

	@NotBlank(message = "用户名不为空")
	private String username;

	private String processKey;

}
