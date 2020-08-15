package com.lucy.timeline.mapper;

import com.lucy.timeline.model.Post;
import org.mapstruct.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PostMapper {
    List<HashMap<String, Object>> selectNewsfeed(Long user_no);

    Post selectPost(Long postNo);

    int insertPost(Post post);

    int updatePost(Post post);

    int deletePost(Long postNo);

}
