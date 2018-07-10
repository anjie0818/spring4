package com.test.springmvc4.web.ch4_7;

import com.test.springmvc4.service.PushServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.async.DeferredResult;

@Controller
public class AysncController {
    @Autowired
    PushServcie pushServcie;
    @RequestMapping("/defer")
    @ResponseBody
    public DeferredResult<String> deferredCall(){
        return pushServcie.getAsyncUpdate();
    }
}
