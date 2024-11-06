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

package org.laokou.iot.tp.api;

import org.laokou.iot.tp.dto.*;
import org.laokou.common.i18n.dto.Page;
import org.laokou.common.i18n.dto.Result;
import org.laokou.iot.tp.dto.clientobject.TpCO;

/**
 *
 * 传输协议接口.
 *
 * @author laokou
 */
public interface TpsServiceI {

	/**
	 * 保存传输协议.
	 * @param cmd 保存命令
	 */
	void save(TpSaveCmd cmd);

	/**
	 * 修改传输协议.
	 * @param cmd 修改命令
	 */
	void modify(TpModifyCmd cmd);

	/**
	 * 删除传输协议.
	 * @param cmd 删除命令
	 */
	void remove(TpRemoveCmd cmd);

	/**
	 * 导入传输协议.
	 * @param cmd 导入命令
	 */
	void importI(TpImportCmd cmd);

	/**
	 * 导出传输协议.
	 * @param cmd 导出命令
	 */
	void export(TpExportCmd cmd);

	/**
	 * 分页查询传输协议.
	 * @param qry 分页查询请求
	 */
	Result<Page<TpCO>> page(TpPageQry qry);

	/**
	 * 查看传输协议.
	 * @param qry 查看请求
	 */
	Result<TpCO> getById(TpGetQry qry);

}