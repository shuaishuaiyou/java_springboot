package com.shuaishuai.ch7_6;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by 帅帅 on 2017/11/14.
 */
@Configuration
@EnableWebSocketMessageBroker//传输stomp的的消息
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{

    //注册stomp协议的节点（endpoint）
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        //使用SockJS协议
        registry.addEndpoint("/endpointshuaishuai").withSockJS();
        registry.addEndpoint("/endpointChat").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.enableSimpleBroker("/topic","/queue");
    }
}
