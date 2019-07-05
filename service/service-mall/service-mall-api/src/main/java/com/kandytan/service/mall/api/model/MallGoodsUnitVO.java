package com.kandytan.service.mall.api.model;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsUnitVO {

    /**
     *  商品单位ID
     */
    private String goodsUnitId;
    /**
     *  商品单位名称
     */
    private String goodsUnitName;
    /**
     *  是否可用
     */
    private Boolean isEnableId;

    public String getGoodsUnitId() {
        return goodsUnitId;
    }

    public void setGoodsUnitId(String goodsUnitId) {
        this.goodsUnitId = goodsUnitId;
    }

    public String getGoodsUnitName() {
        return goodsUnitName;
    }

    public void setGoodsUnitName(String goodsUnitName) {
        this.goodsUnitName = goodsUnitName;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }
}
