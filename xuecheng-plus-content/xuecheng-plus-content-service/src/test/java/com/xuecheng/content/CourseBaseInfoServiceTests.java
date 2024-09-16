package com.xuecheng.content;

import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.base.model.ResponseResult;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import com.xuecheng.content.service.CourseBaseInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author denchouka
 * @description CourseBaseInfoService单元测试
 * @date 2024/8/18 21:08
 */
@SpringBootTest
public class CourseBaseInfoServiceTests {

    @Autowired
    private CourseBaseInfoService courseBaseInfoService;

    @Test
    public void testCourseBaseMapper(){

        // 分页查询的单元测试
        // 查询条件
        QueryCourseParamsDto dto = new QueryCourseParamsDto();
        dto.setCourseName("java");

        // 分页参数对象
        PageParams pageParams = new PageParams(1L, 2L);

        ResponseResult<PageResult<CourseBase>> result = courseBaseInfoService.queryCourseBaseList(pageParams, dto);

        System.out.println("-start*****************************************************************************--");
        System.out.println(result);
        System.out.println("-end*******************************************************************************--");
    }
}
