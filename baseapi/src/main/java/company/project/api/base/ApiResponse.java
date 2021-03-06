/*
 * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package company.project.api.base;

import java.io.Serializable;

/**
 * 接口请求返回
 *
 * @param <T>
 * @author huang
 */
public class ApiResponse<T> implements Serializable {

    public static final String RESPONSE_CODE_SUCCESS = "2000";
    public static final String RESPONSE_CODE_ERROR = "5000";

    /**
     * 标志某一个请求,可以按其跟踪一个接口的请求
     */
    private String requestId;

    /**
     * 系统识别号
     */
    private String system;

    /**
     * 返回结果码
     */
    private String code;

    /**
     * 调用结果信息
     */
    private String message;

    /**
     * 业务返回信息描述
     */
    private String businessMessage;

    /**
     * the business data
     *
     * @see T
     */
    private T data;

    /**
     * 分页信息
     */
    private ApiPage page;

    public static <T> ApiResponse<T> simple(T data) {
        ApiResponse<T> r = new ApiResponse();
        r.data = data;
        r.code = RESPONSE_CODE_SUCCESS;
        return r;
    }

    public ApiResponse<T> page(Integer page, Integer size) {
        this.page = ApiPage.simple(page, size);
        return this;
    }

    public ApiResponse<T> page(Integer page, Integer size, Integer total) {
        this.page = ApiPage.simple(page, size, total);
        return this;
    }

    public ApiResponse<T> data(T data) {
        this.data = data;
        return this;
    }

    public ApiResponse<T> code(String code) {
        this.code = code;
        return this;
    }

    public ApiResponse<T> requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public ApiResponse<T> message(String message) {
        this.message = message;
        return this;
    }

    public ApiResponse<T> system(String system) {
        this.system = system;
        return this;
    }

    public ApiResponse<T> businessMessage(String businessMessage) {
        this.businessMessage = businessMessage;
        return this;
    }


    public ApiPage getPage() {
        return page;
    }

    public void setPage(ApiPage page) {
        this.page = page;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getBusinessMessage() {
        return businessMessage;
    }

    public void setBusinessMessage(String businessMessage) {
        this.businessMessage = businessMessage;
    }
}
