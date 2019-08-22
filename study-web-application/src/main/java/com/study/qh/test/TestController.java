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

    public static void main(String args[]){
        for(int i =100;i<500;i++){
            int dbNo = i%10;
            int tableNo = i%29;
            System.out.println("dbNo:"+dbNo+";"+"tableNo:"+tableNo);
        }
    }


}
