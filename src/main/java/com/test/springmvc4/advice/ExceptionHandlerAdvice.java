package com.test.springmvc4.advice;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;


@ControllerAdvice
public class ExceptionHandlerAdvice {
    //全局异常处理
    @ExceptionHandler(value = Exception.class)
    public ModelAndView exception(Exception e, WebRequest request){
        ModelAndView modelAndView=new ModelAndView("error");
        modelAndView.addObject("errorMessage",e.getMessage());
        return modelAndView;
    }
    //将建值对添加到全集，所有的@requestMapping都可以获得
    @ModelAttribute
    public void addAttributes(Model model){
        model.addAttribute("msg","额外的信息");
    }
    //定制WebDataBinder
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        //忽略request参数的ID
        webDataBinder.setDisallowedFields("id");
    }







}
