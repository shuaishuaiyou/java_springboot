package com.shuaishuai.springmvc.web.ch4_5;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

/**
 * Created by 帅帅 on 2017/11/9.
 */
@Controller
public class SseController {
    @RequestMapping(value = "/push",produces = "text/event-stream")
    @ResponseBody
    public String push(){
        Random random = new Random();
        try{
            Thread.sleep(5000);
            //TimeUnit.SECONDS.sleep(5);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        return "data:Testing 1,2,3" + random.nextInt() + "\n\n";
    }
}
