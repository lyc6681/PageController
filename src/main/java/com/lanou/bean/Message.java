package com.lanou.bean;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

/**
 * Created by dllo on 2017/8/18.
 */
public class Message {

    private Integer id;
    private String content;
    private Integer up;
    private Integer down;
    private Timestamp time;
    private User user;



    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", content='" + content + '\'' +
                ", up=" + up +
                ", down=" + down +
                ", time=" + time +
                ", user=" + user +
                '}';
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getUp() {
        return up;
    }

    public void setUp(Integer up) {
        this.up = up;
    }

    public Integer getDown() {
        return down;
    }

    public void setDown(Integer down) {
        this.down = down;
    }
}
