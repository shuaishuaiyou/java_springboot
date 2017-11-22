package com.shuaishuai;

/**
 * Created by 帅帅 on 2017/11/11.
 */
public class Person {
    private String name;
    private Integer age;
    public Person(){
        super();
    }

    public Person(String name ,Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Integer getAge(){
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
