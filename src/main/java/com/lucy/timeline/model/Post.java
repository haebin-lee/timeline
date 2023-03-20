package com.lucy.timeline.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@AllArgsConstructor
@Getter
public class Post {
    private Long id;
    private Long userId;
    private String contents;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;


    @Builder
    public Post(Long id, Long userId,  String contents) {
        this.id = id;
        this.userId = userId;
        this.contents = contents;
    }
}
