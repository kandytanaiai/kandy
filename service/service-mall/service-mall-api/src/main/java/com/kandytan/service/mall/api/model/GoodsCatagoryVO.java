package com.kandytan.service.mall.api.model;

import java.util.Date;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class GoodsCatagoryVO {

    /**
     *  商品类别ID
     */
    private String goodsCatagoryId;
    /**
     *  商品类别名称
     */
    private String goodsCatagoryName;
    /**
     *  备注
     */
    private String remark;
    /**
     *  创建人ID
     */
    private String createUserId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 是否可用
     */
    private Boolean isEnableId;

    public String getGoodsCatagoryId() {
        return goodsCatagoryId;
    }

    public void setGoodsCatagoryId(String goodsCatagoryId) {
        this.goodsCatagoryId = goodsCatagoryId;
    }

    public String getGoodsCatagoryName() {
        return goodsCatagoryName;
    }

    public void setGoodsCatagoryName(String goodsCatagoryName) {
        this.goodsCatagoryName = goodsCatagoryName;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }
}
