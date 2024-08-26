<?xml version="1.0" encoding="UTF-8"?>
<!--
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
-->
<!DOCTYPE mapper PUBLIC "-//mybatis.org//DTD Mapper 3.0//EN" "http://mybatis.org/dtd/mybatis-3-mapper.dtd">
<mapper namespace="${packageName}.${instanceName}.gatewayimpl.database.${className}Mapper">

	<select id="selectPageByCondition"
			resultType="${packageName}.${instanceName}.gatewayimpl.database.dataobject.${className}DO">
		SELECT *
		from ${name}
		where del_flag = 0
		order by id desc
		limit ${pageQuery}.pageSize} OFFSET ${pageQuery}.pageIndex}
	</select>

	<select id="selectCountByCondition" resultType="long">
		SELECT count(1)
		from ${name}
		where del_flag = 0
	</select>

	<select id="selectVersion" resultType="integer">
		select version
		from ${name}
		where id = ${id}
	</select>

</mapper>