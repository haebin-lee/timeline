package com.lucy.timeline.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
public class Post {
    private Long postNo;
    private Long userNo;
    private String contents;

    @Builder
    public Post(Long userNo, Long postNo, String contents) {
        this.userNo = userNo;
        this.postNo = postNo;
        this.contents = contents;
    }
}
