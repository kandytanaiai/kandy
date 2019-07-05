package com.kandytan.service.mall.api.model;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsSizeVO {

    /**
     *  商品尺码ID
     */
    private String goodsSizeId;
    /**
     *  商品尺码名称
     */
    private String goodsSizeName;
    /**
     *  商品ID
     */
    private String goodsId;
    /**
     *  是否可用
     */
    private Boolean isEnableId;

    public String getGoodsSizeId() {
        return goodsSizeId;
    }

    public void setGoodsSizeId(String goodsSizeId) {
        this.goodsSizeId = goodsSizeId;
    }

    public String getGoodsSizeName() {
        return goodsSizeName;
    }

    public void setGoodsSizeName(String goodsSizeName) {
        this.goodsSizeName = goodsSizeName;
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
