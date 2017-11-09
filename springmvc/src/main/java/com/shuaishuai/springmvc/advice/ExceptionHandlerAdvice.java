package com.shuaishuai.springmvc.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by 帅帅 on 2017/11/8.
 */
@ControllerAdvice //控制器建言
public class ExceptionHandlerAdvice {
    //定义为全局处理  value设置过滤的条件 在这里拦截所有的Exception
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception exception,WebRequest request){
        ModelAndView modelAndView = new ModelAndView("error");

        modelAndView.addObject("errorMessage",exception.getMessage());
        modelAndView.addObject("eee","test");
        return modelAndView;
    }

    //将键值对添加到全局
    //所有注解了@RequestMapping的方法可以得到此键值对
    @ModelAttribute
    public void addAttribute(Model model){
        model.addAttribute("msg","额外信息");
    }

    //定制 WebDataBinder
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        //验证自定义拦截错误信息的例子
       // webDataBinder.setDisallowedFields("id");
    }

}
