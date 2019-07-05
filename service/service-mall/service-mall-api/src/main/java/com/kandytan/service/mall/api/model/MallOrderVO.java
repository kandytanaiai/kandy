package com.kandytan.service.mall.api.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallOrderVO {

    /**
     *  订单ID
     */
    private String orderId;
    /**
     *  订单号
     */
    private String orderNo;
    /**
     *  状态ID：0新建；1待付款；2已付款；
     */
    private Integer stateId;
    /**
     *  金额
     */
    private BigDecimal amount;
    /**
     *  备注
     */
    private String remark;
    /**
     *  医院ID
     */
    private String hospitalId;
    /**
     *  医院名称
     */
    private String hospitalName;
    /**
     *  创建人ID
     */
    private String createUserId;
    /**
     *  创建人名称
     */
    private String createUserName;
    /**
     *  创建时间
     */
    private Date createTime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
