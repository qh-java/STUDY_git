package com.qh.study.bean;

import java.io.Serializable;
import java.sql.Timestamp;

public class Ordi implements Serializable {
    private  Long rowId;

    private String orderId;

    private String b2cOrderId;

    private String b2cOrderItemId;

    private String sapOrderItemId;

    private String orderType;

    private String posOrderId;

    private String distChannel;

    private String storeCode;

    private String deliveryComments;

    private double promTicketMoney;

    private Integer billType;

    private String orditmClass;

    private String deliveryArea;

    private String memInCardNo;

    private String createdBy;

    private String lastUpdBy;

    /** The created time. */
    private Timestamp createdTime;

    private Integer activeFlag;

    private String globalId;

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

    public String getSapOrderItemId() {
        return sapOrderItemId;
    }

    public void setSapOrderItemId(String sapOrderItemId) {
        this.sapOrderItemId = sapOrderItemId;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    public String getPosOrderId() {
        return posOrderId;
    }

    public void setPosOrderId(String posOrderId) {
        this.posOrderId = posOrderId;
    }

    public String getDistChannel() {
        return distChannel;
    }

    public void setDistChannel(String distChannel) {
        this.distChannel = distChannel;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getDeliveryComments() {
        return deliveryComments;
    }

    public void setDeliveryComments(String deliveryComments) {
        this.deliveryComments = deliveryComments;
    }

    public double getPromTicketMoney() {
        return promTicketMoney;
    }

    public void setPromTicketMoney(double promTicketMoney) {
        this.promTicketMoney = promTicketMoney;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public String getOrditmClass() {
        return orditmClass;
    }

    public void setOrditmClass(String orditmClass) {
        this.orditmClass = orditmClass;
    }

    public String getDeliveryArea() {
        return deliveryArea;
    }

    public void setDeliveryArea(String deliveryArea) {
        this.deliveryArea = deliveryArea;
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

    public String getSpecialBusiness() {
        return specialBusiness;
    }

    public void setSpecialBusiness(String specialBusiness) {
        this.specialBusiness = specialBusiness;
    }
}
