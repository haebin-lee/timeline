package com.lucy.timeline.controller;

import com.lucy.timeline.model.Post;
import com.lucy.timeline.model.request.PostRequest;
import com.lucy.timeline.model.response.PostResponse;
import com.lucy.timeline.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Api(tags = "About Posts")
@RequestMapping("/timeline")
@RestController
public class PostController {

    private final PostService postService;

    @ApiOperation(value = "find all registered posts")
    @GetMapping(value = "/users/{userId}/posts")
    public ResponseEntity<List<PostResponse>> findPosts(
            @PathVariable(value = "userId") Long userId
    ) {
        List<Post> posts = postService.findPosts(userId);
        return ResponseEntity.ok(posts.stream().map(PostResponse::new).collect(Collectors.toList()));
    }

    @ApiOperation(value = "find a post")
    @GetMapping(value = "/users/{userId}/posts/{postId}")
    public ResponseEntity<Post> findPost(
            @PathVariable(value = "userId") Long userId,
            @PathVariable(value = "postId") Long postId
    ){
        Post post = postService.findPost(userId, postId);
        return ResponseEntity.ok(post);
    }

    @ApiOperation(value = "register a post")
    @PostMapping(value = "/users/{userId}/post")
    public ResponseEntity<Void> addPost(
            @PathVariable(value = "userId") Long userId,
            @RequestBody PostRequest request
    ){
        postService.addPost(userId, request.getContents());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ApiOperation(value = "update a post")
    @PutMapping(value = "/users/{userId}/posts/{postId}")
    public ResponseEntity<Void> updatePost(
            @PathVariable(value = "userId") Long userId,
            @PathVariable(value = "postId") Long postId,
            @RequestBody PostRequest request
    ){
        // todo: check user validation
        postService.updatePost(postId, request.getContents());
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "delete a post")
    @DeleteMapping(value = "/users/{userId}/posts/{postId}")
    public ResponseEntity<Void> deletePost(
            @PathVariable(value = "userId") Long userId,
            @PathVariable(value = "postId") Long postId
    ){
        // todo: check user validation
        postService.deletePost(postId);
        return ResponseEntity.ok().build();
    }
}
