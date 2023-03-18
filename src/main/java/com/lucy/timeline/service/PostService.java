package com.lucy.timeline.service;

import com.lucy.timeline.mapper.PostMapper;
import com.lucy.timeline.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class PostService {
    private final PostMapper postMapper;

    public List<Post> findPosts(Long userId){
        return postMapper.findPosts(userId);
    }

    public Post findPost(Long userId, Long postId){
        return postMapper.findPost(userId, postId);
    }

    public void addPost(Long userId, String contents){
        Post post = Post.builder()
                .userId(userId)
                .contents(contents)
                .build();
        postMapper.addPost(post);
    }

    public int updatePost(Long id, String content){
        Post post = Post.builder()
                .id(id)
                .contents(content)
                .build();
        return postMapper.updatePost(post);
    }

    public int deletePost(Long id){
        return postMapper.deletePost(id);
    }
}
