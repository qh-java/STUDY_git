package com.qh.study.service;

import com.qh.study.dto.OrderMessageSendOmsqInputDTO;

public interface ReceiveOrderFromB2CService {

    void reveiveOrderInfo(OrderMessageSendOmsqInputDTO inputDTO);

}
