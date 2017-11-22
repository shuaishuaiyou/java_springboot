package com.shuaishuai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Ch522Application {

	@Value("${book.author}")
	private String authorName;
	@Value("${book.name}")
	private String bookName;

	@RequestMapping("/")
	public String index(){
		return "the book name is:" + bookName + "author is:" + authorName;
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch522Application.class, args);
	}
}
