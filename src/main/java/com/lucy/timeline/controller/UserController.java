package com.lucy.timeline.controller;

import com.lucy.timeline.model.User;
import com.lucy.timeline.model.dto.UserDetail;
import com.lucy.timeline.model.request.UserRequest;
import com.lucy.timeline.model.response.UserDetailResponse;
import com.lucy.timeline.model.response.UserResponse;
import com.lucy.timeline.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
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

    @ApiOperation(value = "update username")
    @PutMapping(value = "/users/{userId}")
    public ResponseEntity<Void> updateUser(
            @PathVariable(value = "userId") Long userId,
            @RequestBody UserRequest request
    ){
        userService.updateUser(new User(userId, request.getName()));
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "delete a user")
    @DeleteMapping(value = "/users/{userId}")
    public ResponseEntity<Void> deleteUser(
            @PathVariable(value = "userId") Long userId
    ){
        userService.deleteUser(userId);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "follow")
    @PostMapping(value = "/users/{userId}/follow")
    public ResponseEntity<Void> followUser(
            @PathVariable(value = "userId") Long userId,
            @RequestParam(value = "followUserId") Long followUserId
    ){
        userService.followUser(userId, followUserId);
        return ResponseEntity.ok().build();
    }

    @ApiOperation(value = "unfollow")
    @DeleteMapping(value = "/users/{userId}/follow")
    public ResponseEntity<Void> unfollowUser(
            @RequestParam(value = "userId") Long userId,
            @RequestParam(value = "followUserId") Long followUserId
    ) {
        userService.unFollowUser(userId, followUserId);
        return ResponseEntity.ok().build();
    }
}
