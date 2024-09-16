package com.xuecheng.base.model;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author denchouka
 * @description 分页查询结果模型类
 * @date 2024/8/17 16:51
 */
@Data
@ToString
public class PageResult<T> implements Serializable {

    private static final long serialVersionUID = 8083694359107042462L;

    /**
     * 数据列表
     */
    private List<T> items;

    /**
     * 总记录数
     */
    private Long counts;

    /**
     * 当前页数
     */
    private Long page;

    /**
     * 每页记录数
     */
    private Long pageSize;

    public PageResult(List<T> items, Long counts, Long page, Long pageSize) {
        this.items = items;
        this.counts = counts;
        this.page = page;
        this.pageSize = pageSize;
    }
}
