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
    @GetMapping(value = "/users/{userNo}/posts")
    public ResponseEntity<List<PostResponse>> findPosts(
            @PathVariable(value = "userNo") Long userNo
    ) {
//        List<Post> posts = postService.findPosts(userNo);
        List<Post> posts = new ArrayList<>();
        return ResponseEntity.ok(posts.stream().map(PostResponse::new).collect(Collectors.toList()));
    }

    @ApiOperation(value = "find a post")
    @GetMapping(value = "/users/{userNo}/posts/{postNo}")
    public ResponseEntity<Post> findPost(
            @PathVariable(value = "userNo") Long userNo,
            @PathVariable(value = "postNo") Long postNo
    ){
        Post post = postService.findPost(userNo, postNo);
        return ResponseEntity.ok(post);
    }

    @ApiOperation(value = "register a post")
    @PostMapping(value = "/users/{userNo}/post")
    public ResponseEntity<Void> addPost(
            @PathVariable(value = "userNo") Long userNo,
            @RequestBody PostRequest request
    ){
        postService.addPost(userNo, request.getContents());
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @ApiOperation(value = "update a post")
    @PutMapping(value = "/users/{userNo}/posts/{postNo}")
    public ResponseEntity<Void> updatePost(
            @PathVariable(value = "userNo") Long userNo,
            @PathVariable(value = "postNo") Long postNo,
            @RequestBody PostRequest request
    ){
        // todo: check user validation
        postService.updatePost(postNo, request.getContents());
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "delete a post")
    @DeleteMapping(value = "/users/{userNo}/posts/{postNo}")
    public ResponseEntity<Void> deletePost(
            @PathVariable(value = "userNo") Long userNo,
            @PathVariable(value = "postNo") Long postNo
    ){
        // todo: check user validation
        postService.deletePost(postNo);
        return ResponseEntity.ok().build();
    }
}
