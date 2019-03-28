package com.kandytan.base.model;

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
}
