package com.qh.study.dto;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class OrderMessageSendOmsqInputDTO implements Serializable {
    /**
     * 订单头
     */
    @JSONField(name="orderDetail")
    private OrderMessageHeaderDTO orderMessageHeader;

    /**
     * 订单行
     */
    @JSONField(name="orderDetailItems")
    private List<OrderMessageBodyDTO> orderMessageBody;

    /**
     * getMethod
     */
    public OrderMessageHeaderDTO getOrderMessageHeader() {
        return orderMessageHeader;
    }

    /**
     * setMethod
     */
    public void setOrderMessageHeader(OrderMessageHeaderDTO orderMessageHeader) {
        this.orderMessageHeader = orderMessageHeader;
    }

    /**
     * getMethod
     */
    public List<OrderMessageBodyDTO> getOrderMessageBody() {
        return orderMessageBody;
    }

    /**
     * setMethod
     */
    public void setOrderMessageBody(List<OrderMessageBodyDTO> orderMessageBody) {
        this.orderMessageBody = orderMessageBody;
    }

}
