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

package org.laokou.auth;

import org.laokou.auth.gateway.CaptchaGateway;

import static org.laokou.common.i18n.common.constant.StringConstant.EMPTY;

/**
 * 验证码网关测试.
 *
 * @author laokou
 */
class CaptchaGatewayImplTest implements CaptchaGateway {

	@Override
	public void set(String uuid, String captcha) {

	}

	@Override
	public Boolean validate(String uuid, String code) {
		return true;
	}

	@Override
	public String getKey(String uuid) {
		return EMPTY;
	}

}