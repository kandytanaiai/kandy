package com.kandytan.service.mall.api.model;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsVO {

    /**
     * 商品ID
     */
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品单位ID
     */
    private String goodsUnitId;
    /**
     * 商品类别ID
     */
    private String goodsCatagoryId;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 描述
     */
    private String description;
    /**
     * 备注
     */
    private String remark;
    /**
     * 创建人ID
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

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsUnitId() {
        return goodsUnitId;
    }

    public void setGoodsUnitId(String goodsUnitId) {
        this.goodsUnitId = goodsUnitId;
    }

    public String getGoodsCatagoryId() {
        return goodsCatagoryId;
    }

    public void setGoodsCatagoryId(String goodsCatagoryId) {
        this.goodsCatagoryId = goodsCatagoryId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
