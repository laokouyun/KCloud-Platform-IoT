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

package org.laokou.admin.dto.dict;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import org.laokou.common.i18n.dto.PageQuery;
import org.laokou.common.i18n.utils.StringUtil;

/**
 * @author laokou
 */
@Data
@Schema(name = "DictListQry", description = "字典列表查询参数")
public class DictListQry extends PageQuery {

	@Schema(name = "type", description = "字典类型")
	private String type;

	@Schema(name = "label", description = "字典标签")
	private String label;

	public void setType(String type) {
		this.type = StringUtil.like(type);
	}

	public void setLabel(String label) {
		this.label = StringUtil.like(label);
	}

}
