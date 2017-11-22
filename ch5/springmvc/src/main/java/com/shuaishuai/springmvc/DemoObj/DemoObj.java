package com.shuaishuai.springmvc.DemoObj;

/**
 * Created by 帅帅 on 2017/11/7.
 */
public class DemoObj {
    private Long id;
    private String name;
    //用jackson转换时要有空的构造函数
    public DemoObj(){
        super();
    }
    public DemoObj(Long id,String name){
        super();
        this.id = id;
        this.name = name;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
