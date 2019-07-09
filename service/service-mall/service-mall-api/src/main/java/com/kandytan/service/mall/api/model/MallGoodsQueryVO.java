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
    private String goodsId;
    /**
     * 商品名称
     */
    private String goodsName;
    /**
     * 商品类别ID
     */
    private String goodsCatagoryId;
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

    public String getGoodsCatagoryId() {
        return goodsCatagoryId;
    }

    public void setGoodsCatagoryId(String goodsCatagoryId) {
        this.goodsCatagoryId = goodsCatagoryId;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }
}
