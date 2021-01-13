package com.kandytan.service.mall.api.model;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsSizeVO {

    /**
     *  商品尺码ID
     */
    private Long goodsSizeId;
    /**
     *  商品尺码名称
     */
    private String goodsSizeName;
    /**
     *  商品ID
     */
    private Long goodsId;
    /**
     *  是否可用
     */
    private Boolean isEnableId;

    public String getGoodsSizeName() {
        return goodsSizeName;
    }

    public void setGoodsSizeName(String goodsSizeName) {
        this.goodsSizeName = goodsSizeName;
    }

    public Long getGoodsSizeId() {
        return goodsSizeId;
    }

    public void setGoodsSizeId(Long goodsSizeId) {
        this.goodsSizeId = goodsSizeId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }
}
