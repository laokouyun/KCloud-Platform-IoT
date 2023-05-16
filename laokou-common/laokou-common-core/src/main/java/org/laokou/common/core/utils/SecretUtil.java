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
package org.laokou.common.core.utils;
import org.laokou.common.i18n.core.CustomException;
import org.springframework.util.DigestUtils;
import java.nio.charset.StandardCharsets;
/**
 * @author laokou
 */
public class SecretUtil {

    public static final String APP_KEY = "eaz95v1ba6b05f6c4";
    public static final String APP_SECRET = "vb05f6c45d67340zaz95v7fa6d49v99zx";

    private static final long TIMEOUT_MILLIS = 30 * 1000L;

    public static boolean verification(String sign,String appKey,String appSecret,long timestamp,long userId,String username,long tenantId) {
        // 判断时间戳
        long nowTimestamp = System.currentTimeMillis();
        long maxTimestamp = nowTimestamp + TIMEOUT_MILLIS;
        long minTimestamp = nowTimestamp - TIMEOUT_MILLIS;
        if (timestamp > maxTimestamp || timestamp < minTimestamp) {
            throw new CustomException("请求参数不合法");
        }
        String newSign = sign(appKey,appSecret,timestamp,userId,username,tenantId);
        return sign.equals(newSign);
    }

    /**
     * MD5(appKey+appSecret+timestamp+userId+username+tenantId)转为小写
     */
    private static String sign(String appKey,String appSecret,long timestamp,long userId,String username,long tenantId) {
        String str = appKey
                + appSecret
                + timestamp
                + userId
                + username
                + tenantId;
        return DigestUtils.md5DigestAsHex(str.getBytes(StandardCharsets.UTF_8));
    }

}
