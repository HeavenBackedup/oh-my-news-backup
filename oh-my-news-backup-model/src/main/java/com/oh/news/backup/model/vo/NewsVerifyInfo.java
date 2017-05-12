package com.oh.news.backup.model.vo;

import java.util.Date;

/**
 * Created by llf on 2017/4/26.
 */
public class NewsVerifyInfo {
    private Integer userid;
    private String newsname;
    private Integer status;
    private Date issuetime;
    private Integer sort;
    private Integer currentPage;

    public NewsVerifyInfo(Integer userid, String newsname, Integer status, Date issuetime, Integer sort, Integer currentPage) {
        this.userid = userid;
        this.newsname = newsname;
        this.status = status;
        this.issuetime = issuetime;
        this.sort = sort;
        this.currentPage = currentPage;
    }

    public NewsVerifyInfo(){}



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsVerifyInfo)) return false;

        NewsVerifyInfo that = (NewsVerifyInfo) o;

        if (!userid.equals(that.userid)) return false;
        if (!newsname.equals(that.newsname)) return false;
        if (!status.equals(that.status)) return false;
        if (!issuetime.equals(that.issuetime)) return false;
        if (!sort.equals(that.sort)) return false;
        return currentPage.equals(that.currentPage);
    }

    @Override
    public int hashCode() {
        int result = userid.hashCode();
        result = 31 * result + newsname.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + issuetime.hashCode();
        result = 31 * result + sort.hashCode();
        result = 31 * result + currentPage.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "NewsVerifyInfo{" +
                "userid=" + userid +
                ", newsname='" + newsname + '\'' +
                ", status=" + status +
                ", issuetime=" + issuetime +
                ", sort=" + sort +
                ", currentPage=" + currentPage +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNewsname() {
        return newsname;
    }

    public void setNewsname(String newsname) {
        this.newsname = newsname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getIssuetime() {
        return issuetime;
    }

    public void setIssuetime(Date issuetime) {
        this.issuetime = issuetime;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }
}
