package com.lucy.timeline.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Follow {

    private Long id;
    private Long userId;
    private Long followUserId;

    public Follow(Long userId, Long followUserId) {
        this.userId = userId;
        this.followUserId = followUserId;
    }
}
