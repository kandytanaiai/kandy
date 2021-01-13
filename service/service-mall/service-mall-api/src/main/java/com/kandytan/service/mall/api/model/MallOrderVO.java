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
    private Long orderId;
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
    private Long hospitalId;
    /**
     *  医院名称
     */
    private String hospitalName;
    /**
     *  创建人ID
     */
    private Long createUserId;
    /**
     *  创建人名称
     */
    private String createUserName;
    /**
     *  创建时间
     */
    private Date createTime;

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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
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
