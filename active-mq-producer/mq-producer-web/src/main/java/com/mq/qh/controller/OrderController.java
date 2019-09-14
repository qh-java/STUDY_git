package com.mq.qh.controller;

import com.mq.qh.mq.OrderProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/data")
public class OrderController {

    @Autowired
    OrderProducer orderProducer;

    @RequestMapping("/toData")
    public String toData(String jsonStr){
        orderProducer.sendToOmsq(jsonStr);
        return  null;
    }
}
