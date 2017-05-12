package com.oh.news.backup.model.dto;

import java.util.Date;

/**
 * Created by llf on 2017/5/8.
 */
public class UserDto {
    private Integer userid;
    private String username;
    private Date registertime;
    private Integer status;
    private Integer sort;
    private Integer currentPage;
    private Integer pageItemNum;

    public UserDto(Integer userid, String username, Date registertime, Integer status, Integer sort, Integer currentPage, Integer pageItemNum) {
        this.userid = userid;
        this.username = username;
        this.registertime = registertime;
        this.status = status;
        this.sort = sort;
        this.currentPage = currentPage;
        this.pageItemNum = pageItemNum;
    }

    public UserDto(){}

    @Override
    public String toString() {
        return "UserDto{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", registertime=" + registertime +
                ", status=" + status +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserDto)) return false;

        UserDto userDto = (UserDto) o;

        if (!getUserid().equals(userDto.getUserid())) return false;
        if (!getUsername().equals(userDto.getUsername())) return false;
        if (!getRegistertime().equals(userDto.getRegistertime())) return false;
        return getStatus().equals(userDto.getStatus());
    }

    @Override
    public int hashCode() {
        int result = getUserid().hashCode();
        result = 31 * result + getUsername().hashCode();
        result = 31 * result + getRegistertime().hashCode();
        result = 31 * result + getStatus().hashCode();
        return result;
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

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageItemNum() {
        return pageItemNum;
    }

    public void setPageItemNum(Integer pageItemNum) {
        this.pageItemNum = pageItemNum;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }
}
