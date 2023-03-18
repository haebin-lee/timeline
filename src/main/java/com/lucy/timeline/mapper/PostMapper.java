package com.lucy.timeline.mapper;

import com.lucy.timeline.model.Post;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findPosts(Long user_no);

    Post findPost(Long userNo, Long postNo);

    int addPost(Post post);

    int updatePost(Post post);

    int deletePost(Long postNo);

}
