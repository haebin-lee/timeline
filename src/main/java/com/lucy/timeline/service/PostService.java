package com.lucy.timeline.service;

import com.lucy.timeline.mapper.PostMapper;
import com.lucy.timeline.model.Post;
import com.lucy.timeline.model.request.PostRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class PostService {
    private final PostMapper postMapper;

    public List<Post> findPosts(Long userNo){
        return postMapper.findPosts(userNo);
    }

    public Post findPost(Long userNo, Long postNo){
        return postMapper.findPost(userNo, postNo);
    }

    public void addPost(Long userNo, String contents){
        Post post = Post.builder()
                .userNo(userNo)
                .contents(contents)
                .build();
        postMapper.addPost(post);
    }

    public int updatePost(Long postNo, String content){
        Post post = Post.builder()
                .postNo(postNo)
                .contents(content)
                .build();
        return postMapper.updatePost(post);
    }

    public int deletePost(Long postNo){
        return postMapper.deletePost(postNo);
    }
}
