package com.qh.study.dto;

public class OrderMessageHeaderDTO {
    private String orderId;

    private String b2cOrderId;

    private Integer totalItem;

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

    public String getMemInCardNo() {
        return memInCardNo;
    }

    public void setMemInCardNo(String memInCardNo) {
        this.memInCardNo = memInCardNo;
    }
}
