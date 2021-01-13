package com.kandytan.service.mall.api.model;

/**
 * @author tanjianqin
 * @since 1.0
 */
public class MallOrderGoodsVO {

    /**
     *  订单商品ID
     */
    private Long orderGoodsId;
    /**
     *  商品ID
     */
    private Long goodsId;
    /**
     *  商品名称
     */
    private String goodsName;
    /**
     *  单价
     */
    private String price;
    /**
     *  单位ID
     */
    private Long unitId;
    /**
     *  单位名称
     */
    private String unitName;
    /**
     *  颜色ID
     */
    private Long colorId;
    /**
     *  颜色名称
     */
    private String colorName;
    /**
     *  尺码ID
     */
    private Long sizeId;
    /**
     *  尺码名称
     */
    private String sizeName;
    /**
     *  数量
     */
    private String qty;
    /**
     *  金额
     */
    private String amount;
    /**
     *  备注
     */
    private String remark;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Long getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(Long orderGoodsId) {
        this.orderGoodsId = orderGoodsId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getUnitId() {
        return unitId;
    }

    public void setUnitId(Long unitId) {
        this.unitId = unitId;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public Long getSizeId() {
        return sizeId;
    }

    public void setSizeId(Long sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
