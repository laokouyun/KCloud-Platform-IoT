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

package org.laokou.auth.service.extensionpoint.extension;

import org.laokou.common.core.utils.CollectionUtil;
import org.laokou.common.i18n.common.exception.ParamException;
import org.laokou.common.i18n.utils.StringUtil;

import java.util.List;
import java.util.stream.Stream;

import static org.laokou.common.i18n.common.constant.StringConstant.COMMA;
import static org.laokou.common.i18n.common.exception.ParamException.OAuth2.VALIDATE_FAILED;

/**
 * @author laokou
 */
public abstract class AbstractParamValidator {

	protected void validate(String...validates) {
		List<String> validateList = Stream.of(validates).filter(StringUtil::isNotEmpty).toList();
		if (CollectionUtil.isNotEmpty(validateList)) {
			throw new ParamException(VALIDATE_FAILED,
				StringUtil.collectionToDelimitedString(validateList, COMMA));
		}
	}

}
