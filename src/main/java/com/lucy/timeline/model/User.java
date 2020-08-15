package com.lucy.timeline.model;

import java.sql.Timestamp;

public class User {
    private Long user_no;
    private String user_name;
    private Timestamp join_timestamp;

    public User(Long user_no, String user_name, Timestamp join_timestamp) {
        this.user_no = user_no;
        this.user_name = user_name;
        this.join_timestamp = join_timestamp;
    }

    public User(Long user_no, String user_name){
        this.user_no = user_no;
        this.user_name = user_name;
    }

    public User(String user_name, Timestamp join_timestamp){
        this.user_name = user_name;
        this.join_timestamp = join_timestamp;
    }

    public Long getUser_no() {
        return user_no;
    }

    public void setUser_no(Long user_no) {
        this.user_no = user_no;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Timestamp getJoin_timestamp() {
        return join_timestamp;
    }

    public void setJoin_timestamp(Timestamp join_timestamp) {
        this.join_timestamp = join_timestamp;
    }
}
