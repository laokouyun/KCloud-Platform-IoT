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

package org.laokou.common.domain.support;

import org.laokou.common.i18n.dto.DomainEvent;
import org.laokou.common.rocketmq.template.SendMessageType;

/**
 * 领域事件发布器.
 *
 * @author laokou
 */
public interface DomainEventPublisher {

	/**
	 * 发布领域事件.
	 * @param payload 内容
	 * @param type 发送消息类型
	 */
	void publish(DomainEvent<Long> payload, SendMessageType type);

}
