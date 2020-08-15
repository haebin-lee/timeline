package com.lucy.timeline.service;

import com.lucy.timeline.mapper.PostMapper;
import com.lucy.timeline.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class PostService {

    @Autowired
    private PostMapper postMapper;

    public List<HashMap<String, Object>> selectPostList(Long user_no){
        return postMapper.selectNewsfeed(user_no);
    }

    public Post selectPost(Long post_no){
        return postMapper.selectPost(post_no);
    }

    public int insertPost(Post post){
        return postMapper.insertPost(post);
    }

    public int updatePost(Post post){
        return postMapper.updatePost(post);
    }

    public int deletePost(Long post_no){
        return postMapper.deletePost(post_no);
    }

}
