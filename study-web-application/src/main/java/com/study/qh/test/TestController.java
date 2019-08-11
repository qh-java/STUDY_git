package com.study.qh.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {


    @RequestMapping("welcome")
    public String toWelComde(){
        return "";
    }

}
