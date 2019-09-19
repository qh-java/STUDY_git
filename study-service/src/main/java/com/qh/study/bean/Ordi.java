package com.qh.study.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Ordi implements Serializable {
    private  Long rowId;

    private String orderId;

    private String b2cOrderId;

    private String b2cOrderItemId;

    private String orderType;

    private String memInCardNo;

    private String orderItemId;

    private String createdBy;

    private String lastUpdBy;

    /** The created time. */
    private Timestamp createdTime;

    private Integer activeFlag;


    private String specialBusiness;

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

    public String getSpecialBusiness() {
        return specialBusiness;
    }

    public void setSpecialBusiness(String specialBusiness) {
        this.specialBusiness = specialBusiness;
    }

    public String getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(String orderItemId) {
        this.orderItemId = orderItemId;
    }
}
