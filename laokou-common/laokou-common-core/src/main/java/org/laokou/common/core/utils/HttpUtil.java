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

package org.laokou.common.core.utils;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.hc.client5.http.classic.methods.HttpPost;
import org.apache.hc.client5.http.entity.mime.MultipartEntityBuilder;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClientBuilder;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManager;
import org.apache.hc.client5.http.impl.io.PoolingHttpClientConnectionManagerBuilder;
import org.apache.hc.client5.http.ssl.DefaultClientTlsStrategy;
import org.apache.hc.client5.http.ssl.NoopHostnameVerifier;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.laokou.common.i18n.utils.StringUtil;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.laokou.common.i18n.common.constant.StringConstant.EMPTY;
import static org.laokou.common.i18n.utils.SslUtil.sslContext;

/**
 * http客户端工具类.
 *
 * @author laokou
 */
@Slf4j
public final class HttpUtil {

	/**
	 * 表单提交.
	 * @param url 链接
	 * @param params 参数
	 * @param headers 请求头
	 * @param disableSsl ssl开关
	 * @return 响应结果
	 */
	@SneakyThrows
	public static String doFormDataPost(String url, Map<String, String> params, Map<String, String> headers,
			boolean disableSsl) {
		try (CloseableHttpClient httpClient = getHttpClient(disableSsl)) {
			HttpPost httpPost = new HttpPost(url);
			if (MapUtil.isNotEmpty(headers)) {
				headers.forEach(httpPost::addHeader);
			}
			MultipartEntityBuilder entityBuilder = MultipartEntityBuilder.create();
			if (MapUtil.isNotEmpty(params)) {
				params.forEach(entityBuilder::addTextBody);
			}
			HttpEntity httpEntity = entityBuilder.build();
			httpPost.setEntity(httpEntity);
			String resultString = EMPTY;
			try {
				// 执行请求
				resultString = httpClient.execute(httpPost,
						handler -> EntityUtils.toString(handler.getEntity(), StandardCharsets.UTF_8));
			}
			catch (IOException e) {
				log.error("调用失败，错误信息：{}，详情见日志", StringUtil.isEmpty(e.getMessage()) ? "暂无错误信息" : e.getMessage(), e);
			}
			return resultString;
		}
	}

	public static CloseableHttpClient getHttpClient(boolean disableSsl) {
		// 创建HttpClient对象
		HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
		if (disableSsl) {
			disableSsl(httpClientBuilder);
		}
		return httpClientBuilder.build();
	}

	/**
	 * 关闭ssl校验.
	 * @param builder 构建器
	 */
	@SneakyThrows
	private static void disableSsl(HttpClientBuilder builder) {
		DefaultClientTlsStrategy tlsStrategy = new DefaultClientTlsStrategy(sslContext(),
				NoopHostnameVerifier.INSTANCE);
		PoolingHttpClientConnectionManager poolingHttpClientConnectionManager = PoolingHttpClientConnectionManagerBuilder
			.create()
			.setTlsSocketStrategy(tlsStrategy)
			.build();
		builder.setConnectionManager(poolingHttpClientConnectionManager);
	}

}
