package com.shuaishuai.spring_boot_starter_hello;

/**
 * Created by 帅帅 on 2017/11/10.
 */
public class HelloService {

    private String msg;

    public String sayHello(){
        return "Hello" + msg;
    }



    public String getMsg(){
        return this.msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
