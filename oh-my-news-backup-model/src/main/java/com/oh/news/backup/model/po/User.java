package com.oh.news.backup.model.po;

import java.util.Date;

/**
 * Created by llf on 2017/5/7.
 */
public class User {
    private Integer userid;
    private String username;
    private String email;
    private Date registertime;
    private Integer reportnumber;
    private Integer status;
    private Date deadline;
    public User(Integer userid, String username, String email, Date registertime, Integer reportnumber, Integer status,Date deadline) {
        this.userid = userid;
        this.username = username;
        this.email = email;
        this.registertime = registertime;
        this.reportnumber = reportnumber;
        this.status = status;
        this.deadline=deadline;
    }
    public User(){

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userid +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", reportnumber='" + reportnumber + '\'' +
                ", date=" + registertime+
                ", status'" + status + '\'' +
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getRegistertime() {
        return registertime;
    }

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
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
