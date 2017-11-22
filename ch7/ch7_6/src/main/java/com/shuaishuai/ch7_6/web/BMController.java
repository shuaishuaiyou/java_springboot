package com.shuaishuai.ch7_6.web;

import com.shuaishuai.ch7_6.domain.BroserResponse;
import com.shuaishuai.ch7_6.domain.MyMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by 帅帅 on 2017/11/14.
 */

@Controller
public class BMController {

    @MessageMapping("/welcome")//
    @SendTo("/topic/getResponse")//
    public BroserResponse say(MyMessage message) throws Exception{
        Thread.sleep(3000);
        System.out.println(message.getName());
        return new BroserResponse("Welcome," + message.getName()+"!");
    }

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    @MessageMapping("/chat")
    public void handleChat(Principal principal ,String msg){
        if(principal.getName().equals("asd")){
            messagingTemplate.convertAndSendToUser("zxc",
                    "/queue/notifications",principal.getName() + "-send" + msg);
        }else{
            messagingTemplate.convertAndSendToUser("asd",
                    "/queue/notifications",principal.getName() + "-send" + msg);
        }
    }

}
