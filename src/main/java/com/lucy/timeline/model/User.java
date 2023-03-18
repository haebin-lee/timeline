package com.lucy.timeline.model;

import lombok.Getter;

import java.sql.Timestamp;

@Getter
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
}
