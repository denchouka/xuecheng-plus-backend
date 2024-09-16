package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

/**
 * @author denchouka
 * @description 分页查询的参数
 * @date 2024/8/17 16:42
 */
@Data
@ToString
public class PageParams {

    /**
     * 当前页
     */
    private Long pageNo = 1L;

    /**
     * 每页记录数
     */
    private Long pageSize = 10L;

    public PageParams() {}

    public PageParams(Long pageNo, Long pageSize) {
        this.pageNo = pageNo;
        this.pageSize = pageSize;
    }
}
