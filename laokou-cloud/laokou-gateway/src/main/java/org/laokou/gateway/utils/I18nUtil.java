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

package org.laokou.gateway.utils;

import org.laokou.common.i18n.utils.LocaleUtil;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpHeaders;
import org.springframework.web.server.ServerWebExchange;

/**
 * I18n工具类.
 * @author laokou
 */
public class I18nUtil {

	/**
	 * 请求头数据写入本地线程.
	 * @param exchange 服务网络交换机
	 */
	public static void set(ServerWebExchange exchange) {
		String language = ReactiveRequestUtil.getParamValue(exchange.getRequest(), HttpHeaders.ACCEPT_LANGUAGE);
		LocaleContextHolder.setLocale(LocaleUtil.toLocale(language), true);
	}

	/**
	 * 清空本地线程，防止内存溢出.
	 */
	public static void reset() {
		LocaleContextHolder.resetLocaleContext();
	}

}
