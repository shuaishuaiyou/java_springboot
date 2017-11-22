package com.shuaishuai.ch6_2_3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by 帅帅 on 2017/11/10.
 */
@Component
@ConfigurationProperties(prefix = "author")
//加上是自己的配置文件 默认优先考虑默认的配置文件
@PropertySource("classpath:config/author.properties")


public class AuthorSetings {
    private String name;
    private Long age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }
}
