package com.qfedu.boot1806.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 *@Author feri
 *@Date Created in 2019/1/9 09:35
 */
@Api(value = "欢迎",produces = "初步使用")
@RestController
public class HelloController {

    @ApiOperation(value = "测试数据接口",notes = "欢迎测试")
    @GetMapping("hello.do")
    public String hello(){
        System.out.println("Hello");
        return "早上好";
    }
    @ApiOperation(value = "模拟数组",notes = "需要参数count表示数量")
    @GetMapping("hellolsit.do")
    public List<String> list(int count){
        List<String> list=new ArrayList<>();
        for(int i=1;i<=count;i++){
            list.add("第"+i+"名到教室");
        }
        return list;
    }
}
