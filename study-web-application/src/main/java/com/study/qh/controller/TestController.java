package com.study.qh.controller;

import com.alibaba.fastjson.JSON;
import com.qh.study.dto.OrderMessageBodyDTO;
import com.qh.study.dto.OrderMessageHeaderDTO;
import com.qh.study.dto.OrderMessageSendOmsqInputDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/order")
public class TestController {


    @RequestMapping("receiveOrder")
    public String receiveOrder(Map<String,Object> map){
//        OrderMessageSendOmsqInputDTO input = JSON.to(map.get("input"),OrderMessageSendOmsqInputDTO.class);
        OrderMessageSendOmsqInputDTO inputDTO = JSON.toJavaObject(
                JSON.parseObject((String) map.get("input")), OrderMessageSendOmsqInputDTO.class);
        OrderMessageHeaderDTO header = inputDTO.getOrderMessageHeader();
        List<OrderMessageBodyDTO> body = inputDTO.getOrderMessageBody();
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
