package com.kandytan.base.model;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class BaseCodeVO {

    /**
     * 代码类型：业务字段名 *
     */
    private String codeType;

    /**
     * 代码id *
     */
    private String codeId;

    /**
     * 代码名称 *
     */
    private String codeName;

    /**
     * 是否可用：0不可用；1可用； *
     */
    private String isEnable;

    /**
     * 备注
     */
    private String remark;

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    public String getCodeName() {
        return codeName;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public String getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(String isEnable) {
        this.isEnable = isEnable;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
