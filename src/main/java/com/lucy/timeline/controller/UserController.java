package com.lucy.timeline.controller;

import com.lucy.timeline.model.User;
import com.lucy.timeline.model.dto.UserDetail;
import com.lucy.timeline.model.request.UserRequest;
import com.lucy.timeline.model.response.UserDetailResponse;
import com.lucy.timeline.model.response.UserResponse;
import com.lucy.timeline.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Api(tags = "About Users")
@RequestMapping("/timeline")
@RestController
public class UserController {

    private final UserService userService;

    @ApiOperation(value = "find users")
    @GetMapping(value = "/users")
    public ResponseEntity<List<UserResponse>> findUsers(){
        List<User> users = userService.findUsers();
        return ResponseEntity.ok(users.stream().map(UserResponse::new).collect(Collectors.toList()));
    }

    @ApiOperation(value = "find a user")
    @GetMapping(value = "/users/{userId}")
    public ResponseEntity<UserDetailResponse> findUser(
            @PathVariable(value = "userId") Long userId
    ){
        UserDetail user = userService.findUser(userId);
        return ResponseEntity.ok(new UserDetailResponse(user));
    }

    @ApiOperation(value = "register a user")
    @PostMapping(value = "/user")
    public ResponseEntity<Void> addUser(
            @RequestBody UserRequest request
    ){
        userService.addUser(request);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
//
//    @ApiOperation(value = "유저 이름 변경")
//    @RequestMapping(value = "/user/{userNo}", method = RequestMethod.PUT)
//    public CustomResult updateUser(
//            @PathVariable(value = "userNo", required = true) Long userNo,
//            @RequestParam(value = "userName", required = true) String userName
//    )throws Exception{
//        int success = userService.updateUser(new User(userNo, userName));
//
//        CustomResult result = new CustomResult();
//        if(success == 0)
//            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
//        return result;
//    }
//
//    @ApiOperation(value = "유저 삭제")
//    @RequestMapping(value = "/user/{userNo}", method = RequestMethod.DELETE)
//    public CustomResult deleteUser(
//            @PathVariable(value = "userNo", required = true) Long userNo
//    )throws Exception{
//        int success = userService.deleteUser(userNo);
//
//        CustomResult result = new CustomResult();
//        if(success == 0)
//            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
//        return result;
//    }
//
//    @ApiOperation(value = "팔로우 하기")
//    @RequestMapping(value = "/user/follow", method = RequestMethod.POST)
//    public CustomResult insertFollowUser(
//            @RequestParam(value = "user_no", required = true) Long user_no,
//            @RequestParam(value = "follow_user_no", required = true) Long follow_user_no
//    ) throws Exception{
//
//        Follow follow = new Follow();
//        follow.setUser_no(user_no);
//        follow.setFollow_user_no(follow_user_no);
//        int success = userService.followUser(follow);
//
//        CustomResult result = new CustomResult();
//        if(success == 0)
//            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
//        return result;
//    }
//
//    @ApiOperation(value = "언팔로우 하기")
//    @RequestMapping(value = "/user/follow", method = RequestMethod.DELETE)
//    public CustomResult deleteFollowUser(
//            @RequestParam(value = "user_no", required = true) Long user_no,
//            @RequestParam(value = "follow_user_no", required = true) Long follow_user_no
//    ) throws Exception{
//        Follow follow = new Follow();
//        follow.setUser_no(user_no);
//        follow.setFollow_user_no(follow_user_no);
//
//        int success = userService.unFollowUser(follow);
//        CustomResult result = new CustomResult();
//        if(success == 0)
//            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
//        return result;
//    }
}
