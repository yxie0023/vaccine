package edu.monash.controller;

import edu.monash.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public @ResponseBody String test(){
        return "hellow";
    }
}
