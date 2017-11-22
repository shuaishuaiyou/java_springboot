package com.shuaishuai.ch5_2_3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication//开启自动配置
public class Ch523Application {

	@RequestMapping("/")
	String index(){
		return "Hello Sprign Boot";
	}
	public static void main(String[] args) {
		SpringApplication.run(Ch523Application.class, args);
	}
}
