package com.shuaishuai.springmvc.web.ch4_3;

import com.shuaishuai.springmvc.DemoObj.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by 帅帅 on 2017/11/7.
 */
@Controller
@RequestMapping("/anno")//访问路径
public class DemoAnnoController {

    //返回的媒体类型  和数据格式
    @RequestMapping(produces = "text/plain;charset=UTF-8")
    public @ResponseBody String index(HttpServletRequest request){
        return "url:"+request.getRequestURL() + "can access";
    }

    @RequestMapping(value = "/pathvar/{str}",produces =
    "text/plain;charset=UTF-8")
    public @ResponseBody String demoPathVar(@PathVariable String str,
                                         HttpServletRequest request   ){
        return "url:"+request.getRequestURL() + "can access ,str:"+str;
    }

    @RequestMapping(value = "/requestParam",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String passRequestParam(Long id,HttpServletRequest request){
        return "url:" + request.getRequestURL() + " can access ,id " + id;
    }

    @RequestMapping(value = "/obj",produces = "application/json;charsetUTF-8")
    @ResponseBody
    public String passObj(DemoObj obj ,HttpServletRequest request){
        return "url:" + request.getRequestURL() + "can access ,obj id :"+ obj.getId() +
                "obj name :" + obj.getName();
    }

    //{"/name","/name2"}   "/name"
    @RequestMapping(value = {"/name1","/name2"},produces =
            "text/plain;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url:"+ request.getRequestURL() + " can access";
    }


 }
