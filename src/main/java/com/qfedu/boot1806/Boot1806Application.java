package com.qfedu.boot1806;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2  //启用Swagger
@MapperScan("com.qfedu.boot1806.dao") //扫描MyBatis的接口
public class Boot1806Application {
	public static void main(String[] args) {
		//启动项目
		SpringApplication.run(Boot1806Application.class, args);
	}
}