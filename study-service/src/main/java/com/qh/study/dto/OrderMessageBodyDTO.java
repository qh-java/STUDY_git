package com.qh.study.dto;

import com.alibaba.fastjson.annotation.JSONField;

public class OrderMessageBodyDTO {
    @JSONField(name = "orderId")
    private String orderId;
    @JSONField(name = "b2cOrderId")
    private String b2cOrderId;
    @JSONField(name = "b2cOrderItemId")
    private String b2cOrderItemId;
    @JSONField(name = "orderType")
    private String orderType;
    @JSONField(name = "orderItemId")
    private String  orderItemId;

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }

    public String getMemInCardNo() {
        return memInCardNo;
    }

    public void setMemInCardNo(String memInCardNo) {
        this.memInCardNo = memInCardNo;
    }

    private String memInCardNo;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getB2cOrderId() {
        return b2cOrderId;
    }

    public void setB2cOrderId(String b2cOrderId) {
        this.b2cOrderId = b2cOrderId;
    }

    public String getB2cOrderItemId() {
        return b2cOrderItemId;
    }

    public void setB2cOrderItemId(String b2cOrderItemId) {
        this.b2cOrderItemId = b2cOrderItemId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

}
