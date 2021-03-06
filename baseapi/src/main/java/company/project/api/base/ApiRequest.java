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
 * 请求接口定义
 *
 * @param <T>
 * @author huang
 */
public class ApiRequest<T> implements Serializable {

    /**
     * 标志某一个请求,可以按其跟踪一个接口的请求
     */
    private String requestId;

    /**
     * tip: 一些接口可能需要定义较长的超时时间,通过该属性修改处理
     */
    private Long timeOut;

    /**
     * 标记一个用户的信息,在从报文体中分开,方便网关处理
     */
    private String token;

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

    /**
     * 快速构建方法
     *
     * @return
     */
    public static <T> ApiRequest<T> simple(T t) {
        ApiRequest<T> r = new ApiRequest<>();
        r.setData(t);
        r.setRequestId(String.valueOf(System.nanoTime()));
        r.setTimeOut(60 * 1000L);
        r.setToken("simple");
        return r;
    }

    public ApiRequest<T> page(Integer page, Integer size) {
        this.page = ApiPage.simple(page, size);
        return this;
    }

    public ApiRequest<T> token(String token) {
        this.token = token;
        return this;
    }

    public ApiRequest<T> requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public ApiRequest<T> timeOut(Long timeOut) {
        this.timeOut = timeOut;
        return this;
    }

    public ApiRequest<T> data(T data) {
        this.data = data;
        return this;
    }


    public ApiPage getPage() {
        return page;
    }

    public void setPage(ApiPage page) {
        this.page = page;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Long getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Long timeOut) {
        this.timeOut = timeOut;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
