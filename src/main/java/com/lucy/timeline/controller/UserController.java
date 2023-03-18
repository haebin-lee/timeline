package com.lucy.timeline.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RestController;

@Api(tags = "About Users")
@RestController
public class UserController {
//
//    @Autowired
//    private UserService userService;
//
//    @ApiParam(value = "find users")
//    @GetMapping(value = "/users")
//    public ResponseEntity<List<User>> findUsers(){
//        List<User> users = userService.findUsers();
//        return ResponseEntity.ok(users);
//    }
//
//    @ApiParam(value = "find a user")
//    @GetMapping(value = "/user/{userNo}")
//    public CustomResult findUser(
//            @PathVariable(value = "userNo", required = true) Long userNo
//    ){
//        HashMap<String, Object> user = userService.selectUserByUserNo(userNo);
//
//        CustomResult result = new CustomResult();
//        if(user == null || user.isEmpty())
//            result.setResultCode(HttpServletResponse.SC_NO_CONTENT);
//        result.setResultData(user);
//        return result;
//    }
//
//    @ApiOperation(value = "유저 등록")
//    @RequestMapping(value = "/user", method = RequestMethod.POST)
//    public CustomResult insertUser(
//            @RequestParam(value = "userName", required = true) String userName
//    )throws Exception{
//        User user = userService.insertUser(new User(userName, new Timestamp(System.currentTimeMillis())));
//        CustomResult result = new CustomResult();
//        if(user == null)
//            result.setResultCode(HttpServletResponse.SC_BAD_REQUEST);
//        result.setResultData(user);
//        return result;
//    }
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
