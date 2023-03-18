package com.lucy.timeline.mapper;

import com.lucy.timeline.model.Post;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findPosts(Long userId);

    Post findPost(Long userId, Long postId);

    int addPost(Post post);

    int updatePost(Post post);

    int deletePost(Long id);

}
