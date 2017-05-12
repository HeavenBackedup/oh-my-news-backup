package com.oh.news.backup.model.po;

import java.util.Date;

/**
 * Created by llf on 2017/5/7.
 */
public class News {
    private Integer userid;
    private Integer newsid;
    private String newsname;
    private Date issuetime;
    private Integer thumb_up;
    private Integer commentnumber;
    private Integer reportnumber;
    private Integer status;
    private Date deadline;

    public News(Integer userid, Integer newsid, String newsname, Date issuetime, Integer thumb_up, Integer commentnumber, Integer reportnumber, Integer status, Date deadline) {
        this.userid = userid;
        this.newsid = newsid;
        this.newsname = newsname;
        this.issuetime = issuetime;
        this.thumb_up = thumb_up;
        this.commentnumber = commentnumber;
        this.reportnumber = reportnumber;
        this.status = status;
        this.deadline = deadline;
    }

    public News(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof News)) return false;

        News news = (News) o;

        if (!userid.equals(news.userid)) return false;
        if (!newsid.equals(news.newsid)) return false;
        if (!newsname.equals(news.newsname)) return false;
        if (!issuetime.equals(news.issuetime)) return false;
        if (!thumb_up.equals(news.thumb_up)) return false;
        if (!commentnumber.equals(news.commentnumber)) return false;
        if (!reportnumber.equals(news.reportnumber)) return false;
        if (!status.equals(news.status)) return false;
        return deadline.equals(news.deadline);
    }

    @Override
    public int hashCode() {
        int result = userid.hashCode();
        result = 31 * result + newsid.hashCode();
        result = 31 * result + newsname.hashCode();
        result = 31 * result + issuetime.hashCode();
        result = 31 * result + thumb_up.hashCode();
        result = 31 * result + commentnumber.hashCode();
        result = 31 * result + reportnumber.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + deadline.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "News{" +
                "userid=" + userid +
                ", newsid=" + newsid +
                ", newsname='" + newsname + '\'' +
                ", issuetime=" + issuetime +
                ", thumb_up=" + thumb_up +
                ", commentnumber=" + commentnumber +
                ", reportnumber=" + reportnumber +
                ", status=" + status +
                ", deadline=" + deadline +
                '}';
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewsname() {
        return newsname;
    }

    public void setNewsname(String newsname) {
        this.newsname = newsname;
    }

    public Date getIssuetime() {
        return issuetime;
    }

    public void setIssuetime(Date issuetime) {
        this.issuetime = issuetime;
    }

    public Integer getThumb_up() {
        return thumb_up;
    }

    public void setThumb_up(Integer thumb_up) {
        this.thumb_up = thumb_up;
    }

    public Integer getCommentnumber() {
        return commentnumber;
    }

    public void setCommentnumber(Integer commentnumber) {
        this.commentnumber = commentnumber;
    }

    public Integer getReportnumber() {
        return reportnumber;
    }

    public void setReportnumber(Integer reportnumber) {
        this.reportnumber = reportnumber;
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
