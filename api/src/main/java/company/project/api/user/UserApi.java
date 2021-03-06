/*
 * Copyright 2002-2019 the original author or authors.
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

package company.project.api.user;


import company.project.api.base.ApiRequest;
import company.project.api.base.ApiResponse;

/**
 * 对外使用的用户接口样例.<br>
 * 一般来说，这会与具体的实现模块分开，方便分发到一些rpc工具中使用<br>
 * tip: 一般在定义在供外部使用的代码中，since 是非常必要的，使用者可以发现不同版本的差别<br>
 * tip: rpc 等接口定义，请不要用service 这样的命名，请使用api ,使用api结尾让使用者知道这是一个远程的调用<br>
 * tip: rpc 的调用是非常耗时的，应该避免在循环里调用<br>
 *
 * @author huang
 * @since 1.0.0
 */
public interface UserApi {

    /**
     * 一个简单的查询方法.
     * tip: 我们习惯于使用find 代替 get ，因为get 动词容易与javabean 冲突
     *
     * @param id
     * @return the user
     */
    ApiResponse<UserVo> findUserById(ApiRequest<Long> id);

    /**
     * 更新用户信息
     *
     * @param userVo
     * @return
     */
    ApiResponse<UserVo> updateUser(ApiRequest<UserVo> userVo);
}
