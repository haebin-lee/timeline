package com.lucy.timeline.controller;

import com.lucy.timeline.model.CustomResult;
import com.lucy.timeline.model.Post;
import com.lucy.timeline.service.PostService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Api(tags = "포스팅")
@RestController
public class PostController {

    @Autowired
    private PostService postService;

    @ApiParam(value = "뉴스피드 조회")
    @RequestMapping(value = "/newsfeed", method = RequestMethod.GET)
    public CustomResult selectNewsfeed(
            @RequestParam(value = "user_no", required = true) Long userNo
    ) throws Exception{

        // 팔로워들의 뉴스피드 조회
        List<HashMap<String, Object>> all = postService.selectPostList(userNo);

        CustomResult result = new CustomResult();
        if(all.size() == 0)
            result.setResultCode(HttpServletResponse.SC_NO_CONTENT);
        result.setResultData(all);
        return result;
    }

    @ApiParam(value = "포스팅 조회")
    @RequestMapping(value = "/post/{postNo}", method = RequestMethod.GET)
    public CustomResult selectPost(
            @PathVariable(value = "postNo", required = true) Long postNo
    )throws Exception{
        Post post = postService.selectPost(postNo);

        CustomResult result = new CustomResult();
        if(post == null)
            result.setResultCode(HttpServletResponse.SC_NO_CONTENT);
        result.setResultData(post);
        return result;
    }

    @ApiOperation(value = "포스팅 등록")
    @RequestMapping(value = "/post", method = RequestMethod.POST)
    public CustomResult insertPost(
            @RequestParam(value = "user_no", required = true) Long userNo,
            @RequestParam(value = "contents", required = true) String contents
    )throws Exception{
        // TODO: 유저 확인

        Post post = new Post();
        post.setUser_no(userNo);
        post.setContents(contents);

        int success = postService.insertPost(post);

        CustomResult result = new CustomResult();
        if(success == 0)
            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
        return result;
    }

    @ApiOperation(value = "포스팅 업데이트")
    @RequestMapping(value = "/post/{postNo}", method = RequestMethod.PUT)
    public CustomResult updatePost(
            @PathVariable(value = "postNo", required = true) Long postNo,
            @RequestParam(value = "contents", required = true) String contents
    )throws Exception{
        // TODO: 유저 확인

        Post post = new Post();
        post.setPost_no(postNo);
        post.setContents(contents);
        int success = postService.updatePost(post);

        CustomResult result = new CustomResult();
        if(success == 0)
            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
        return result;
    }

    @ApiOperation(value = "포스팅 삭제")
    @RequestMapping(value = "/post/{postNo}", method = RequestMethod.DELETE)
    public CustomResult deletePost(
            @PathVariable(value = "postNo", required = true) Long postNo
    )throws Exception{
        // TODO: 유저 확인

        int success = postService.deletePost(postNo);
        CustomResult result = new CustomResult();
        if(success == 0)
            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
        return result;
    }

}
