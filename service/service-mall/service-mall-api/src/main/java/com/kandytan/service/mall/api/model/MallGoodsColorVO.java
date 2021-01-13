package com.kandytan.service.mall.api.model;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsColorVO {

    /**
     *  商品颜色ID
     */
    private Long goodsColorId;
    /**
     *  商品颜色名称
     */
    private String goodsColorName;
    /**
     *  商品ID
     */
    private Long goodsId;
    /**
     *  是否可用
     */
    private Boolean isEnableId;

    public String getGoodsColorName() {
        return goodsColorName;
    }

    public void setGoodsColorName(String goodsColorName) {
        this.goodsColorName = goodsColorName;
    }

    public Long getGoodsColorId() {
        return goodsColorId;
    }

    public void setGoodsColorId(Long goodsColorId) {
        this.goodsColorId = goodsColorId;
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
