/**
 * Copyright (c) 2022 KCloud-Platform-Alibaba Authors. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 *   http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.laokou.rocketmq.consumer.feign.oss.fallback;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.laokou.common.core.utils.HttpResult;
import org.laokou.rocketmq.consumer.feign.oss.MailApiFeignClient;
/**
 * 服务降级
 * @author laokou
 */
@Slf4j
@AllArgsConstructor
public class MailApiFeignClientFallback implements MailApiFeignClient {

    private final Throwable throwable;

    @Override
    public HttpResult<Boolean> send(String mail) {
        log.error("服务调用失败，报错原因：{}",throwable.getMessage());
        return new HttpResult<Boolean>().error("Mail服务未启动，请联系管理员");
    }
}
