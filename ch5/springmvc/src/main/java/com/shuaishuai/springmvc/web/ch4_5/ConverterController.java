package com.shuaishuai.springmvc.web.ch4_5;

import com.shuaishuai.springmvc.DemoObj.DemoObj;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by 帅帅 on 2017/11/8.
 */
public class ConverterController {
    @RequestMapping(value = "/convert",produces = {"application/x-wisely"})
    public @ResponseBody DemoObj convert(@RequestBody DemoObj demoObj){
        return demoObj;
    }
}
