package com.kandytan.service.mall.api.model;

import com.kandytan.base.util.Pager;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallGoodsQueryVO {

    /**
     * 商品ID
     */
    private Long goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品类别ID
     */
    private Long goodsCatagoryId;
    /**
     * 是否可用
     */
    private Boolean isEnableId;
    /**
     * 分页
     */
    private Pager pager;

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getGoodsCatagoryId() {
        return goodsCatagoryId;
    }

    public void setGoodsCatagoryId(Long goodsCatagoryId) {
        this.goodsCatagoryId = goodsCatagoryId;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }
}
