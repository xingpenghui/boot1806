package com.qfedu.boot1806;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qfedu.boot1806.controller","com.qfedu.boot1806.app.contronller"})
@EnableSwagger2  //启用Swagger
public class Boot1806Application {
	public static void main(String[] args) {
		//启动项目
		SpringApplication.run(Boot1806Application.class, args);
	}
}