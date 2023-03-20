package com.lucy.timeline.mapper;

import com.lucy.timeline.model.Follow;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface FollowMapper {

    Follow findFollow(Long userId, Long followUserId);

    void addFollow(Follow follow);

    void deleteFollow(Long userId, Long followUserId);

    void deleteFollowByUserId(Long userId);
}
