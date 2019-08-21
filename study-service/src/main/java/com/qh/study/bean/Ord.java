package com.qh.study.bean;

import java.io.Serializable;

public class Ord implements Serializable {

    private  Long rowId;

    private String orderId;

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
}
