package com.xuecheng.content.api;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.base.model.ResponseResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author denchouka
 * @description 课程信息编辑接口
 * @date 2024/8/17 23:10
 */
@RestController
public class CourseBaseInfoContrtoller {

    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    /**
     * 查询课程信息
     * @param pageParams 分页查询的参数
     * @param queryCourseParamsDto 课程查询条件
     * @return 查询结果
     */
    @PostMapping("/course/list")
    public ResponseResult<PageResult<CourseBase>> list(PageParams pageParams, @RequestBody(required = false) QueryCourseParamsDto queryCourseParamsDto) {

        return courseBaseInfoService.queryCourseBaseList(pageParams, queryCourseParamsDto);
    }
}
