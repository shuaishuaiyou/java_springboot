package com.shuaishuai.ch6_2_3;

import com.shuaishuai.ch6_2_3.config.AuthorSetings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch623Application {

	@Autowired
	private AuthorSetings authorSetings;

	@RequestMapping("/")
	public String index(){
		return "Author name is :" + authorSetings.getName()+"   age: "+authorSetings
				.getAge();
	}
	public static void main(String[] args) {
		SpringApplication.run(Ch623Application.class, args);
	}
}
