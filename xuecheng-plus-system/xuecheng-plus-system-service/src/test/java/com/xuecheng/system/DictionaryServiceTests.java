package com.xuecheng.system;

import com.xuecheng.system.model.po.Dictionary;
import com.xuecheng.system.service.DictionaryService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author denchouka
 * @description DictionaryService单元测试
 * @date 2024/9/5 22:43
 */
@SpringBootTest
public class DictionaryServiceTests {

    @Autowired
    private DictionaryService dictionaryService;

    @Test
    public void test() {
        List<Dictionary> list = dictionaryService.list();
        System.out.println(list);
    }
}
