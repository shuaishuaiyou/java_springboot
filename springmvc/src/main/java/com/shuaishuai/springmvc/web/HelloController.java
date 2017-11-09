package com.shuaishuai.springmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 帅帅 on 2017/11/6.
 */
@Controller
public class HelloController {

        @RequestMapping("/index1")
        public String hello() {
            return "index";
        }

}
