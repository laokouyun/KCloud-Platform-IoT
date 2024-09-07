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

/*
 * Copyright 2002-2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.security.web.util;

/**
 * Provides common CSS classes and styles, valid across Servlet and Reactive stacks.
 *
 * @author Daniel Garnier-Moiroux
 * @author laokou
 * @since 6.4
 */
public final class CssUtils {

	private CssUtils() {
	}

	/**
	 * Generates the CSS used by all Spring Security default pages, such as login or
	 * logout pages.
	 * @return the {@code <style>} block containing the common CSS
	 */
	public static String getCssStyleBlock() {
		return """
				<style>
				/* General layout */
				body {
				  font-family: system-ui, "Segoe UI", Roboto, "Helvetica Neue", Arial, sans-serif;
				  background-color: #eee;
				  padding: 100px 0;
				  margin: 0;
				}

				h2 {
				  margin-top: 0;
				  margin-bottom: 0.5rem;
				  font-size: 2rem;
				  font-weight: 500;
				  line-height: 2rem;
				}

				.content {
				  margin-right: auto;
				  margin-left: auto;
				  padding-right: 15px;
				  padding-left: 15px;
				  width: 100%;
				  box-sizing: border-box;
				}

				@media (min-width: 800px) {
				  .content {
				    max-width: 760px;
				  }
				}

				/* Components */
				a,
				a:visited {
				  text-decoration: none;
				  color: #06f;
				}

				a:hover {
				  text-decoration: underline;
				  color: #003c97;
				}

				select,
				input[type="text"],
				input[type="password"] {
				  height: auto;
				  width: 100%;
				  font-size: 1rem;
				  padding: 0.5rem;
				  box-sizing: border-box;
				}

				button {
				  padding: 0.5rem 1rem;
				  font-size: 1.25rem;
				  line-height: 1.5;
				  border: none;
				  border-radius: 0.1rem;
				  width: 100%;
				}

				button.primary {
				  color: #fff;
				  background-color: #06f;
				}

				.alert {
				  padding: 0.75rem 1rem;
				  margin-bottom: 1rem;
				  line-height: 1.5;
				  border-radius: 0.1rem;
				  width: 100%;
				  box-sizing: border-box;
				  border-width: 1px;
				  border-style: solid;
				}

				.alert.alert-danger {
				  color: #6b1922;
				  background-color: #f7d5d7;
				  border-color: #eab6bb;
				}

				.alert.alert-success {
				  color: #145222;
				  background-color: #d1f0d9;
				  border-color: #c2ebcb;
				}

				.screenreader {
				  position: absolute;
				  clip: rect(0 0 0 0);
				  height: 1px;
				  width: 1px;
				  padding: 0;
				  border: 0;
				  overflow: hidden;
				}

				table {
				  width: 100%;
				  max-width: 100%;
				  margin-bottom: 2rem;
				}

				.table-striped tr:nth-of-type(2n + 1) {
				  background-color: #e1e1e1;
				}

				td {
				  padding: 0.75rem;
				  vertical-align: top;
				}

				/* Login / logout layouts */
				.login-form,
				.logout-form {
				  max-width: 340px;
				  padding: 0 15px 15px 15px;
				  margin: 0 auto 2rem auto;
				  box-sizing: border-box;
				}
				</style>
				""";
	}

}
