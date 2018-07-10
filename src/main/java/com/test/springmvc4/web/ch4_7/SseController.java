package com.test.springmvc4.web.ch4_7;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class SseController {
    @RequestMapping(value = "/push",produces = "text/event-stream")
    //使用event-stream的媒体类型，支持SSE推送
    public @ResponseBody String push(){
        Random random=new Random();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  "data:Testing 1 2 3 "+random.nextInt()+"\n\n";
    }
}
