package com.lucy.timeline.model.request;

import com.lucy.timeline.model.User;
import lombok.Getter;

@Getter
public class UserRequest {
    private String name;

    public User toModel() {
        return new User(this.name);
    }
}
