package com.shuaishuai.springmvc.web.ch4_6;


import com.shuaishuai.springmvc.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 帅帅 on 2017/11/9.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Autowired
    DemoService demoService;

    @RequestMapping(value = "testRest",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public String testRest(){
        return demoService.saySomething();
    }
}
