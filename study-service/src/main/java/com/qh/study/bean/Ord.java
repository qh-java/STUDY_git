package com.qh.study.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Ord implements Serializable {



    private  Long rowId;

    private String orderId;

    private String b2cOrderId;

    private String orderRes;

    private String orderChannel;

    private String orderComments;

    private Integer payItemNum;

    private String orderCategory;

    private Integer totalItem ;

    private String memInCardNo;

    private String createdBy;

    private String lastUpdBy;

    /** The created time. */
    private Timestamp createdTime;

    private Integer activeFlag;

    private String globalId;

    public Long getRowId() {
        return rowId;
    }

    public void setRowId(Long rowId) {
        this.rowId = rowId;
    }

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

    public Integer getPayItemNum() {
        return payItemNum;
    }

    public void setPayItemNum(Integer payItemNum) {
        this.payItemNum = payItemNum;
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }

    public Integer getTotalItem() {
        return totalItem;
    }

    public void setTotalItem(Integer totalItem) {
        this.totalItem = totalItem;
    }

    public String getMemInCardNo() {
        return memInCardNo;
    }

    public void setMemInCardNo(String memInCardNo) {
        this.memInCardNo = memInCardNo;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getLastUpdBy() {
        return lastUpdBy;
    }

    public void setLastUpdBy(String lastUpdBy) {
        this.lastUpdBy = lastUpdBy;
    }

    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    public Integer getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(Integer activeFlag) {
        this.activeFlag = activeFlag;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }
}
