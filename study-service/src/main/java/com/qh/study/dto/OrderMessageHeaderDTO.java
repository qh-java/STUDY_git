package com.qh.study.dto;

public class OrderMessageHeaderDTO {

    private String orderId;

    private String b2cOrderId;

    private String orderRes;

    private String orderChannel;

    private String orderComments;

    private String payItemNum;

    private String orderCategory;

    private String totalItem ;

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

    public String getOrderRes() {
        return orderRes;
    }

    public void setOrderRes(String orderRes) {
        this.orderRes = orderRes;
    }

    public String getOrderChannel() {
        return orderChannel;
    }

    public void setOrderChannel(String orderChannel) {
        this.orderChannel = orderChannel;
    }

    public String getOrderComments() {
        return orderComments;
    }

    public void setOrderComments(String orderComments) {
        this.orderComments = orderComments;
    }

    public String getPayItemNum() {
        return payItemNum;
    }

    public void setPayItemNum(String payItemNum) {
        this.payItemNum = payItemNum;
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }

    public String getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(String totalItem) {
        this.totalItem = totalItem;
    }

    public String getMemInCardNo() {
        return memInCardNo;
    }

    public void setMemInCardNo(String memInCardNo) {
        this.memInCardNo = memInCardNo;
    }
}
