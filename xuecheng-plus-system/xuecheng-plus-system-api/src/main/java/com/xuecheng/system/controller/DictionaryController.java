package com.xuecheng.system.controller;

import com.xuecheng.base.model.ResponseResult;
import com.xuecheng.system.model.po.Dictionary;
import com.xuecheng.system.service.DictionaryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 数据字典 前端控制器
 * </p>
 *
 * @author itcast
 */
@Slf4j
@RestController
public class DictionaryController  {

    @Autowired
    private DictionaryService  dictionaryService;

    /**
     * 查询全部字典数据
     * @return 全部字典数据
     */
    @GetMapping("/dictionary/all")
    public ResponseResult<List<Dictionary>> queryAll() {
        return dictionaryService.queryAll();
    }

    /**
     * 根据code查询数据字典
     * @param code code
     * @return 字典数据
     */
    @GetMapping("/dictionary/code/{code}")
    public ResponseResult<Dictionary> getByCode(@PathVariable String code) {
        return dictionaryService.getByCode(code);
    }
}
