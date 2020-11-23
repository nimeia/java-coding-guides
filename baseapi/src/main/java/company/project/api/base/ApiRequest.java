/* * Copyright (c) 2020. Lorem ipsum dolor sit amet, consectetur adipiscing elit. * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan. * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna. * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus. * Vestibulum commodo. Ut rhoncus gravida arcu. */package company.project.api.base;/** * 请求接口定义 * * @param <T> */public class ApiRequest<T> {    /**     * 标志某一个请求,可以按其跟踪一个接口的请求     */    private String requestId;    /**     * tip: 一些接口可能需要定义较长的超时时间,通过该属性修改处理     */    private Long timeOut;    /**     * 标记一个用户的信息,在从报文体中分开,方便网关处理     */    private String token;    /**     * the business data     *     * @see T     */    private T data;    public String getRequestId() {        return requestId;    }    public void setRequestId(String requestId) {        this.requestId = requestId;    }    public Long getTimeOut() {        return timeOut;    }    public void setTimeOut(Long timeOut) {        this.timeOut = timeOut;    }    public String getToken() {        return token;    }    public void setToken(String token) {        this.token = token;    }    public T getData() {        return data;    }    public void setData(T data) {        this.data = data;    }}