package com.kandytan.util;

import java.io.Serializable;
import java.util.List;

//ffff
public class Pager<T> implements Serializable {

    /** 首页 */
    private int firstPage;
    /** 尾页 */
    private int lastPage;
    /** 下页 */
    private int nextPage;
    /** 上页 */
    private int prePage;

    /**
     * 每页记录数
     */
    private int pageSize;
    /**
     * 记录开始索引
     */
    private int recIndexStart;
    /**
     * 记录结束索引
     */
    private int recIndexEnd;
    /**
     * 当前页
     */
    private int currPage;
    /**
     * 记录总数
     */
    private int recCount;
    /**
     * 页总数
     */
    private int pageCount;
    /**
     * 数据列表
     */
    private List<T> dataList;

    public Pager() {
        this.pageSize = 5;
        this.firstPage = 1;
    }

    public Pager(int currPage) {
        this();

        if (currPage > 0)
            this.currPage = currPage;
        else
            this.currPage = 1;
    }

    public Pager(int recCount, int currPage) {
        this(currPage);

        this.recCount = recCount;
        this.calc();
    }

    public Pager(List<T> dataList, int recCount, int currPage) {
        this(recCount, currPage);
        this.dataList = dataList;
    }

    public Pager(List<T> dataList, int recCount, int currPage, int pageSize) {
        this(dataList, recCount, currPage);
        this.pageSize = pageSize;
    }

    public void calc() {
        if(0 == this.recCount) {
            this.currPage = 0;
            this.prePage = 0;
            this.recIndexEnd = 0;
            this.recIndexStart = 0;
            this.nextPage = 0;
            this.lastPage = 0;
            this.pageCount = 0;
            this.firstPage = 0;
            return;
        }
        this.pageCount = this.recCount / this.pageSize;
        if(this.recCount % this.pageSize > 0)
            this.pageCount = this.pageCount  + 1;
        this.lastPage = this.pageCount;
        this.nextPage = this.currPage;
        if(this.nextPage < lastPage)
            this.nextPage = this.nextPage + 1;
        this.prePage = this.currPage;
        if(this.prePage > this.firstPage)
            this.prePage = this.prePage - 1;
        this.recIndexStart = this.currPage * this.pageSize - this.pageSize;
        this.recIndexEnd = this.currPage * this.pageSize - 1;
    }

    public int getFirstPage() {
        return firstPage;
    }

    public void setFirstPage(int firstPage) {
        this.firstPage = firstPage;
    }

    public int getLastPage() {
        return lastPage;
    }

    public void setLastPage(int lastPage) {
        this.lastPage = lastPage;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }

    public int getPrePage() {
        return prePage;
    }

    public void setPrePage(int prePage) {
        this.prePage = prePage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRecIndexStart() {
        return recIndexStart;
    }

    public void setRecIndexStart(int recIndexStart) {
        this.recIndexStart = recIndexStart;
    }

    public int getRecIndexEnd() {
        return recIndexEnd;
    }

    public void setRecIndexEnd(int recIndexEnd) {
        this.recIndexEnd = recIndexEnd;
    }

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getRecCount() {
        return recCount;
    }

    public void setRecCount(int recCount) {
        this.recCount = recCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
