package com.kandytan.base.util;

/**
 * @author Kandy Tan
 * @since 1.0
 */
public class OperResult<T> {
    public OperResult() {
        super();
    }

    public OperResult(T t) {
        this();
        this.t = t;
    }

    /**
     * 标识：成功true；失败false；
     */
    public boolean flag = false;

    /**
     * 提示语
     */
    public String msg;

    /**
     * 被操作对象
     */
    public T t;

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void setUnknownError() {
        this.setFlag(false);
        this.setMsg("未知错误，请与管理员联系");
    }

    public void setSuccess(String msg) {
        this.setFlag(true);
        this.setMsg(msg);
    }
}
