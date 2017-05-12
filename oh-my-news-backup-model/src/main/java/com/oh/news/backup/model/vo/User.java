package com.oh.news.backup.model.vo;

import java.util.Date;

/**
 * Created by llf on 2017/4/21.
 */
public class User {
    
    private Integer userid;
    private String username;
    private String registeremail;
    private Date registertime;
    private Integer reportnumber;
    private Integer status;
    private Date deadline;

    public User(Integer userid, String username, String registeremail, Date registertime, Integer reportnumber, Integer status, Date deadline) {
        this.userid = userid;
        this.username = username;
        this.registeremail = registeremail;
        this.registertime = registertime;
        this.reportnumber = reportnumber;
        this.status = status;
        this.deadline = deadline;
    }
    public User(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        if (!userid.equals(user.userid)) return false;
        if (!username.equals(user.username)) return false;
        if (!registeremail.equals(user.registeremail)) return false;
        if (!registertime.equals(user.registertime)) return false;
        if (!reportnumber.equals(user.reportnumber)) return false;
        if (!status.equals(user.status)) return false;
        return deadline.equals(user.deadline);
    }

    @Override
    public int hashCode() {
        int result = userid.hashCode();
        result = 31 * result + username.hashCode();
        result = 31 * result + registeremail.hashCode();
        result = 31 * result + registertime.hashCode();
        result = 31 * result + reportnumber.hashCode();
        result = 31 * result + status.hashCode();
        result = 31 * result + deadline.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid=" + userid +
                ", username='" + username + '\'' +
                ", registeremail='" + registeremail + '\'' +
                ", registertime=" + registertime +
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegisteremail() {
        return registeremail;
    }

    public void setRegisteremail(String registeremail) {
        this.registeremail = registeremail;
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
