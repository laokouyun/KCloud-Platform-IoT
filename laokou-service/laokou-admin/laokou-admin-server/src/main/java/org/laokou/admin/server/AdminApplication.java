/**
 * Copyright (c) 2022 KCloud-Platform-Alibaba Authors. All Rights Reserved.
 * <p>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.laokou.admin.server;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import freemarker.template.TemplateException;
import lombok.RequiredArgsConstructor;
import org.laokou.common.dynamic.router.utils.RouterUtil;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;

/**
 * 架构演变
 * 单机架构（两层架构）
 * 三层架构（集中式架构）
 * DDD分层架构(分布式微服务架构) > 表现层 应用层 领域层 基础层
 * @author laokou
 */
@SpringBootApplication(scanBasePackages = {"org.laokou.common.tenant"
        , "org.laokou.common.i18n"
        , "org.laokou.common.log"
        , "org.laokou.common.data.cache"
        , "org.laokou.common.data.filter"
        , "org.laokou.common.security"
        , "org.laokou.common.sentinel"
        , "org.laokou.common.elasticsearch"
        , "org.laokou.common.swagger"
        , "org.laokou.common.core"
        , "org.laokou.common.dynamic.router"
        , "org.laokou.admin"
        , "org.laokou.common.redis"
        , "org.laokou.common.oss"
        , "org.laokou.flowable.client"
        , "org.laokou.common.openfeign"
        , "org.laokou.common.mybatisplus"
        , "org.laokou.auth.client"})
@EnableDiscoveryClient
@EnableConfigurationProperties
@EnableAspectJAutoProxy(exposeProxy = true)
@EnableEncryptableProperties
@EnableFeignClients
@EnableAsync
@MapperScan(value = {"org.laokou.admin.server.domain.sys.repository.mapper"
        , "org.laokou.common.tenant.mapper"
        , "org.laokou.common.oss.mapper"
        , "org.laokou.common.log.mapper"})
@RequiredArgsConstructor
public class AdminApplication implements CommandLineRunner {

    private final RouterUtil routerUtil;

    public static void main(String[] args) {
        // SpringSecurity 子线程读取父线程的上下文
        System.setProperty(SecurityContextHolder.SYSTEM_PROPERTY,SecurityContextHolder.MODE_INHERITABLETHREADLOCAL);
        SpringApplication.run(AdminApplication.class, args);
    }

    @Override
    public void run(String... args) throws TemplateException, IOException {
        routerUtil.initRouter();
    }
}