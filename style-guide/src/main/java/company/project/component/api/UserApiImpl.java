/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.component.api;

import company.project.api.base.ApiRequest;
import company.project.api.base.ApiResponse;
import company.project.api.user.UserApi;
import company.project.api.user.UserVo;
import company.project.component.utils.SomeUtils;

/**
 * @author huang
 * @see company.project.api.user.UserApi
 */
public class UserApiImpl implements UserApi {

    /**
     * @param id
     * @return
     * @see UserApi#findUserById(ApiRequest)
     */
    @Override
    public ApiResponse<UserVo> findUserById(ApiRequest<Long> id) {
        UserVo userVo = new UserVo();
        return ApiResponse.simple(userVo).system(SomeUtils.SYSTEM_SSO);
    }

    /**
     * @param userVo
     * @return
     * @see UserApi#updateUser(ApiRequest)
     */
    @Override
    public ApiResponse<UserVo> updateUser(ApiRequest<UserVo> userVo) {
        return null;
    }
}
