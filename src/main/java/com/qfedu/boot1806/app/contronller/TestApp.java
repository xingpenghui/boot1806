package com.qfedu.boot1806.app.contronller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *@Author feri
 *@Date Created in 2019/1/9 10:06
 */
@RestController
public class TestApp {
    @GetMapping("test1.do")
    public String t1(){
        return "返回数据";
    }
}
