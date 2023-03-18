package com.lucy.timeline.model.dto;

import com.lucy.timeline.model.User;
import lombok.Getter;

@Getter
public class UserDetail extends User {

    private Long followerCnt;
    private Long followingCnt;

    public UserDetail(String name) {
        super(name);
    }
}
