package com.oh.news.backup.model.dto;

import java.util.Date;

/**
 * Created by llf on 2017/5/10.
 */
public class NewsDto {
    private Integer userid;
    private String newsname;
    private Integer status;
    private Date issuetime;
    private Integer sort;
    private Integer currentPage;
    private Integer pageItemNum;

    public NewsDto(Integer userid, String newsname, Integer status, Date issuetime, Integer sort, Integer currentPage, Integer pageItemNum) {
        this.userid = userid;
        this.newsname = newsname;
        this.status = status;
        this.issuetime = issuetime;
        this.sort = sort;
        this.currentPage = currentPage;
        this.pageItemNum = pageItemNum;
    }
    public NewsDto(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof NewsDto)) return false;

        NewsDto newsDto = (NewsDto) o;

        if (!userid.equals(newsDto.userid)) return false;
        if (!newsname.equals(newsDto.newsname)) return false;
        if (!status.equals(newsDto.status)) return false;
        if (!issuetime.equals(newsDto.issuetime)) return false;
        if (!sort.equals(newsDto.sort)) return false;
        if (!currentPage.equals(newsDto.currentPage)) return false;
        return pageItemNum.equals(newsDto.pageItemNum);
    }

    @Override
    public int hashCode() {
        int result = userid.hashCode();
        result = 31 * result + newsname.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + issuetime.hashCode();
        result = 31 * result + sort.hashCode();
        result = 31 * result + currentPage.hashCode();
        result = 31 * result + pageItemNum.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "NewsDto{" +
                "userid=" + userid +
                ", newsname='" + newsname + '\'' +
                ", status=" + status +
                ", issuetime=" + issuetime +
                ", sort=" + sort +
                ", currentPage=" + currentPage +
                ", pageItenNum=" + pageItemNum +
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

    public Integer getPageItemNum() {
        return pageItemNum;
    }

    public void setPageItemNum(Integer pageItenNum) {
        this.pageItemNum = pageItenNum;
    }
}
