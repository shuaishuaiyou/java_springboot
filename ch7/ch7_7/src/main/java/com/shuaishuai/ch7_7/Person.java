package com.shuaishuai.ch7_7;

/**
 * Created by 帅帅 on 2017/11/20.
 */
public class Person {
    private String name;
    private Integer age;
    private String address;

    public Person(){
        super();
    }
    public Person(String name,Integer age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
