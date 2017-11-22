package com.shuaishuai.ch7_6.domain;

/**
 * Created by 帅帅 on 2017/11/14.
 */
public class BroserResponse {
    private String resMessage;
    public BroserResponse(String resMessage){
        this.resMessage = resMessage;
    }

    public String getResMessage(){
        return resMessage;
    }
}
