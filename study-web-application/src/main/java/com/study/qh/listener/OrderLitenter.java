package com.study.qh.listener;

import com.alibaba.fastjson.JSON;
import com.qh.study.dto.OrderMessageSendOmsqInputDTO;
import com.qh.study.service.ReceiveOrderFromB2CService;
import com.study.qh.base.AbstractMessageListenerImpl;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderLitenter extends AbstractMessageListenerImpl {

    @Autowired
    ReceiveOrderFromB2CService receiveOrderFromB2CService;

    @Override
    public void doProcess(String jsonStr) {
        OrderMessageSendOmsqInputDTO input = JSON.parseObject(jsonStr, OrderMessageSendOmsqInputDTO.class);
        receiveOrderFromB2CService.reveiveOrderInfo(input);
    }
}
