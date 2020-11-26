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
 * API 查询分页对象
 */
public class ApiPage implements Serializable {

    public static Integer DEFAULT_PAGE_SIZE = 20;
    /**
     * 当前页码
     */
    private Integer page;
    /**
     * 每页大小
     */
    private Integer pageSize;
    /**
     * 总记录数
     */
    private Integer totalSize;

    public ApiPage() {
    }

    public ApiPage(Integer page, Integer pageSize) {
        this.page = page;
        this.pageSize = pageSize;
    }

    public ApiPage(Integer page, Integer pageSize, Integer totalSize) {
        this.page = page;
        this.pageSize = pageSize;
        this.totalSize = totalSize;
    }

    public static ApiPage simple() {
        return new ApiPage(0, DEFAULT_PAGE_SIZE);
    }

    public static ApiPage simple(Integer page) {
        return new ApiPage(page, DEFAULT_PAGE_SIZE);
    }

    public static ApiPage simple(Integer page, Integer size) {
        return new ApiPage(page, size);
    }

    public static ApiPage simple(Integer page, Integer size, Integer total) {
        return new ApiPage(page, size, total);
    }


    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalSize() {
        return totalSize;
    }

    public void setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
    }
}
