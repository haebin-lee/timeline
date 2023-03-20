package com.lucy.timeline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public class User {
    private Long id;
    private String name;
    private LocalDateTime joinedAt;

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(String name) {
        this.name = name;
        this.joinedAt = LocalDateTime.now();
    }
}
