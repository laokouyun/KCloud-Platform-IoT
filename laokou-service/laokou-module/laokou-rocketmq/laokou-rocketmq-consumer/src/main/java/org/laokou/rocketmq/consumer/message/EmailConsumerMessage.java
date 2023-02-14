/**
 * Copyright (c) 2022 KCloud-Platform-Alibaba Authors. All Rights Reserved.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.laokou.rocketmq.consumer.message;
import lombok.RequiredArgsConstructor;
import org.laokou.common.core.exception.CustomException;
import org.laokou.common.core.utils.HttpResult;
import org.laokou.rocketmq.client.constant.RocketmqConstant;
import org.laokou.rocketmq.consumer.feign.oss.MailApiFeignClient;
import org.springframework.stereotype.Component;
/**
 * @author laokou
 */
@Component(RocketmqConstant.MAIL_TAG)
@RequiredArgsConstructor
public class EmailConsumerMessage implements ConsumerMessage {

    private final MailApiFeignClient mailApiFeignClient;

    @Override
    public void receiveMessage(String mail) {
        HttpResult<Boolean> result = mailApiFeignClient.send(mail);
        if (!result.success()) {
            throw new CustomException(result.getCode(),result.getMsg());
        }
    }

}
