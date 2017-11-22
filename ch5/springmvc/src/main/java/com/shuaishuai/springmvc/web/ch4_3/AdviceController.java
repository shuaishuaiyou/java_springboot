package com.shuaishuai.springmvc.web.ch4_3;

import com.shuaishuai.springmvc.DemoObj.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 帅帅 on 2017/11/8.
 */
@Controller
public class AdviceController {
    @RequestMapping(value = "/advice")
    public String getSomething(@ModelAttribute("msg") String msg,DemoObj obj){
        throw new IllegalArgumentException("参数异常"+"来自 @ModelAttribute"+msg);
    }
}
