package com.xuecheng.content;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xuecheng.base.model.PageParams;
import com.xuecheng.base.model.PageResult;
import com.xuecheng.content.mapper.CourseBaseMapper;
import com.xuecheng.content.model.dto.QueryCourseParamsDto;
import com.xuecheng.content.model.po.CourseBase;
import org.apache.commons.lang.StringUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author denchouka
 * @description CourseBaseMapper单元测试
 * @date 2024/8/18 21:08
 */
@SpringBootTest
public class CourseBaseMapperTests{

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Test
    public void testCourseBaseMapper(){
        CourseBase courseBase = courseBaseMapper.selectById(18L);
        Assertions.assertNotNull(courseBase, "courseBase is null.....");

        // 分页查询的单元测试
        // 查询条件
        QueryCourseParamsDto dto = new QueryCourseParamsDto();
        dto.setCourseName("java");

        // 分页参数对象
        PageParams pageParams = new PageParams(1L, 2L);

        // 拼装查询条件
        LambdaQueryWrapper<CourseBase> wrapper = new LambdaQueryWrapper<>();
        // 根据名称模糊查询
        wrapper.like(StringUtils.isNotEmpty(dto.getCourseName()), CourseBase::getName, dto.getCourseName());
        // 根据审核状态查询
        wrapper.eq(StringUtils.isNotEmpty(dto.getAuditStatus()), CourseBase::getAuditStatus, dto.getAuditStatus());
        // 发布状态查询
        wrapper.eq(StringUtils.isNotEmpty(dto.getPublishStatus()), CourseBase::getStatus, dto.getPublishStatus());

        // 创建分页参数对象
        Page<CourseBase> page = new Page<>(pageParams.getPageNo(), pageParams.getPageSize());

        Page<CourseBase> pages = courseBaseMapper.selectPage(page, wrapper);

        PageResult<CourseBase> pageResult = new PageResult<>(pages.getRecords(), pages.getTotal(), pages.getCurrent(), pages.getSize());
        System.out.println("-start*****************************************************************************--");
        System.out.println(pageResult);
        System.out.println("-end*******************************************************************************--");
    }
}
