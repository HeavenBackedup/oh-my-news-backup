package com.oh.news.backup.model.vo;

import java.util.Date;

/**
 * Created by llf on 2017/4/21.
 */
public class UserVerifyInfo {

    private Integer userid;
    private String username;
    private Date registertime;
    private Integer status;
    private Integer sort;
    private Integer currentPage;

    public UserVerifyInfo(Integer userid, String username, Date registertime, Integer status, Integer sort, Integer currentPage) {
        this.userid = userid;
        this.username = username;
        this.registertime = registertime;
        this.status = status;
        this.sort = sort;
        this.currentPage = currentPage;
    }
    public UserVerifyInfo(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserVerifyInfo)) return false;

        UserVerifyInfo that = (UserVerifyInfo) o;

        if (!userid.equals(that.userid)) return false;
        if (!username.equals(that.username)) return false;
        if (!registertime.equals(that.registertime)) return false;
        if (!status.equals(that.status)) return false;
        if (!sort.equals(that.sort)) return false;
        return currentPage.equals(that.currentPage);
    }

    @Override
    public int hashCode() {
        int result = userid.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + registertime.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + sort.hashCode();
        result = 31 * result + currentPage.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "UserVerifyInfo{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", registertime=" + registertime +
                ", status=" + status +
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
