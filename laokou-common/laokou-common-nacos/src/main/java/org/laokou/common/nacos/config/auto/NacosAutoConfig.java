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

package org.laokou.common.nacos.config.auto;

import com.alibaba.nacos.client.naming.remote.NamingClientProxy;
import org.laokou.common.nacos.proxy.ProtocolProxy;
import org.laokou.common.nacos.proxy.ProtocolProxyDelegate;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author laokou
 */
@AutoConfiguration
@ComponentScan("org.laokou.common.nacos")
public class NacosAutoConfig {

	/**
	 * {@link NamingClientProxy}
	 * @param serverProperties server配置
	 * @return ProtocolProxy
	 */
	@Bean
	public ProtocolProxy protocolProxy(ServerProperties serverProperties) {
		return new ProtocolProxyDelegate(serverProperties.getSsl().isEnabled());
	}

}
