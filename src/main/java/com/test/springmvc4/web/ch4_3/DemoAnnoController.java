package com.test.springmvc4.web.ch4_3;

import com.test.springmvc4.domain.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {
    @RequestMapping(produces="text/plain;charset=UTF-8")
    /*
    未设置路径，同类路径；produces可以定制返回的response媒体类型和字符集，
    若需要返回json对象，设置produces="application/json;charset=UTF-8"
     */
    //@responseBody:将返回值凡在response体内，而不是返回一个页面
    public @ResponseBody String index(HttpServletRequest request){//可以接收request/response作为参数
        return "url:"+request.getRequestURL()+" can access";
    }
    // @PathVariable:接收路径参数，实现访问不同路径调用一个方法
    @RequestMapping(value = "/pathvar/{path}",produces = "text/palin;charset=UTF-8")
    public @ResponseBody String demoPachVar(HttpServletRequest request, @PathVariable String path){
        return "url:"+request.getRequestURL()+"  can access,path:"+path;
    }
    //获取请求参数
    @RequestMapping(value = "/requestParam",produces = "text/palin;charset=UTF-8")
    public @ResponseBody String  passRequestParam(HttpServletRequest request,long id){
        return  "url:"+request.getRequestURL()+" id="+id;
    }
    //将请求参数封装为对象
    @RequestMapping(value = "/obj",produces = "text/palin;charset=UTF-8")
    @ResponseBody
    public String passObj(HttpServletRequest request,DemoObj obj){
        return "url:"+request.getRequestURL()+"obj:id="+obj.getId()+"name="+obj.getName();
    }
    //同一方法接收多个请求
    @RequestMapping(value = {"/remove1","/remove2"},produces = "text/palin;charset=UTF-8")
    public @ResponseBody String remove(HttpServletRequest request){
        return "url:"+request.getRequestURL();
    }
}
