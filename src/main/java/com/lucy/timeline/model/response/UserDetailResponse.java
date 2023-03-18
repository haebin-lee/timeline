package com.lucy.timeline.model.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.lucy.timeline.model.dto.UserDetail;
import lombok.Getter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Getter
public class UserDetailResponse extends UserResponse{

    private Long followerCnt;
    private Long followingCnt;

    public UserDetailResponse(UserDetail detail) {
        if (detail != null) {
            this.id = detail.getId();
            this.name = detail.getName();
            this.joinedAt = detail.getJoinedAt();
            this.followerCnt = detail.getFollowerCnt();
            this.followingCnt = detail.getFollowingCnt();
        }
    }
}
