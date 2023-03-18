package com.lucy.timeline.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Post {
    private Long id;
    private Long userId;
    private String contents;

    @Builder
    public Post(Long id, Long userId,  String contents) {
        this.id = id;
        this.userId = userId;
        this.contents = contents;
    }
}
