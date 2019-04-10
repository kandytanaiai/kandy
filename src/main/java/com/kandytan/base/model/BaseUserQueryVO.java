package com.kandytan.base.model;

import com.kandytan.util.Pager;

/**
 * 用户信息查询
 * @Kandy Tan
 * @since 1.0.0
 */
public class BaseUserQueryVO {

    /** 用户id */
    private String userId;

    /**
     * 用户名称 *
     */
    private String userName;

    /**
     * 电话号码
     */
    private String tel;

    /**
     * email
     */
    private String email;

    /**
     * 分页
     */
    private Pager pager;

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

    public Pager getPager() {
        return pager;
    }

    public void setPager(Pager pager) {
        this.pager = pager;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
