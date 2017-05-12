package com.oh.news.backup.model.vo;

import java.util.Date;

/**
 * Created by llf on 2017/4/25.
 */
public class News {

    private Integer newsid;
    private Integer status;
    private Date deadline;

    public News(Integer newsid, Integer status, Date deadline) {
        this.newsid = newsid;
        this.status = status;
        this.deadline = deadline;
    }
    public News(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;

        News news = (News) o;

        if (!newsid.equals(news.newsid)) return false;
        if (!status.equals(news.status)) return false;
        return deadline.equals(news.deadline);
    }

    @Override
    public int hashCode() {
        int result = newsid.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + deadline.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "News{" +
                "newsid=" + newsid +
                ", status=" + status +
                ", deadline=" + deadline +
                '}';
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
}
