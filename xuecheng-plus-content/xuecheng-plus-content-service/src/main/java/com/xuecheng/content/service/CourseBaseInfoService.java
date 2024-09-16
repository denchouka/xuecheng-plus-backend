package com.xuecheng.content.service;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.base.model.ResponseResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;

/**
 * @author denchouka
 * @description 课程信息管理接口
 * @date 2024/8/19 22:28
 */
public interface CourseBaseInfoService {

    /**
     * 课程分页查询
     * @param pageParams 分页查询的参数
     * @param queryCourseParamsDto 课程查询条件
     * @return 查询结果
     */
    ResponseResult<PageResult<CourseBase>> queryCourseBaseList(PageParams pageParams, QueryCourseParamsDto queryCourseParamsDto);
}
