package com.test.springmvc4.web.ch4_3;

import com.test.springmvc4.domain.DemoObj;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class DemoRestController {
    @RequestMapping(value = "getjson",produces = "application/json;charset=UTF-8")
    public DemoObj getJson(){
        return new DemoObj(1,"anjie");
    }
    @RequestMapping(value = "getxml",produces = "application/xml;charset=UTF-8")
    public DemoObj getXml(DemoObj obj){
        return new DemoObj(obj.getId()+4,obj.getName()+"ajjie");
    }
}
