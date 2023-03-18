package com.lucy.timeline.model;

import lombok.Getter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Getter
public class User {
    private Long id;
    private String name;
    private LocalDateTime joinedAt;

    public User(String name) {
        this.name = name;
        this.joinedAt = LocalDateTime.now();
    }
}
