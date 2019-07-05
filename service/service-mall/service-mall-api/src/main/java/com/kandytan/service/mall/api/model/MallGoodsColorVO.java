package com.kandytan.service.mall.api.model;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsColorVO {

    /**
     *  商品颜色ID
     */
    private String goodsColorId;
    /**
     *  商品颜色名称
     */
    private String goodsColorName;
    /**
     *  商品ID
     */
    private String goodsId;
    /**
     *  是否可用
     */
    private Boolean isEnableId;

    public String getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(String goodsColorId) {
        this.goodsColorId = goodsColorId;
    }

    public String getGoodsColorName() {
        return goodsColorName;
    }

    public void setGoodsColorName(String goodsColorName) {
        this.goodsColorName = goodsColorName;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }
}
