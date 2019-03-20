package com.kandytan.base.model;

import org.apache.commons.lang3.StringUtils;

import java.sql.Date;
import java.sql.Timestamp;

/**
 * 用户信息
 *
 * @author Kandy Tan
 * @since 1.0.0
 */
public class BaseUserVO {

    public BaseUserVO() {
        this.setCreateTime(new Timestamp(System.currentTimeMillis()));
        this.setEnableId(true);
    }

    public boolean validate() {
        if (StringUtils.isBlank(userId) || StringUtils.isBlank(userName) ||
                null == userTypeId || null == sexId ||
                StringUtils.isBlank(tel) || StringUtils.isBlank(email) ||
                null == createTime || null == isEnableId)
            return false;
        else
            return true;
    }

    /**
     * 用户id *
     */
    private String userId;

    /**
     * 用户名称 *
     */
    private String userName;

    /**
     * 用户类型id *
     */
    private Integer userTypeId;

    /**
     * 用户类型name
     */
    private String userTypeName;

    /**
     * 性别id *
     */
    private Integer sexId;

    /**
     * 性别name
     */
    private String sexName;

    /**
     * 出生日期
     */
    private Date birthday;

    /**
     * 电话号码 *
     */
    private String tel;

    /**
     * 电子邮箱 *
     */
    private String email;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建人id
     */
    private String createUserId;

    /**
     * 创建人name
     */
    private String createUserName;

    /**
     * 创建时间 *
     */
    private Timestamp createTime;

    /**
     * 是否可用id *
     */
    private Boolean isEnableId;

    /**
     * 是否可用name
     */
    private String isEnableName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserTypeId() {
        return userTypeId;
    }

    public void setUserTypeId(Integer userTypeId) {
        this.userTypeId = userTypeId;
    }

    public String getUserTypeName() {
        return userTypeName;
    }

    public void setUserTypeName(String userTypeName) {
        this.userTypeName = userTypeName;
    }

    public String getSexName() {
        return sexName;
    }

    public void setSexName(String sexName) {
        this.sexName = sexName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
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

    public String getCreateUserName() {
        return createUserName;
    }

    public void setCreateUserName(String createUserName) {
        this.createUserName = createUserName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getIsEnableName() {
        return isEnableName;
    }

    public void setIsEnableName(String isEnableName) {
        this.isEnableName = isEnableName;
    }

    public Integer getSexId() {
        return sexId;
    }

    public void setSexId(Integer sexId) {
        this.sexId = sexId;
    }

    public Boolean getEnableId() {
        return isEnableId;
    }

    public void setEnableId(Boolean enableId) {
        isEnableId = enableId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
