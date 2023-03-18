package com.lucy.timeline.model.response;

import com.lucy.timeline.model.Post;
import lombok.Getter;

@Getter
public class PostResponse {
    private Long id;
    private Long userId;
    private String contents;

    public PostResponse(Post post) {
        this.id = post.getId();
        this.userId = post.getUserId();
        this.contents = post.getContents();
    }
}
