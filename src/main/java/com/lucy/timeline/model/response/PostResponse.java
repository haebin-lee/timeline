package com.lucy.timeline.model.response;

import com.lucy.timeline.model.Post;
import lombok.Getter;

@Getter
public class PostResponse {
    private Long postNo;
    private Long userNo;
    private String contents;

    public PostResponse(Post post) {
        this.postNo = post.getPostNo();
        this.userNo = post.getUserNo();
        this.contents = post.getContents();
    }
}
