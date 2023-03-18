//package com.lucy.timeline.service;
//
//import com.lucy.timeline.mapper.UserMapper;
//import com.lucy.timeline.model.Follow;
//import com.lucy.timeline.model.User;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.HashMap;
//import java.util.List;
//
//@Service
//@Transactional
//public class UserService {
//
//    @Autowired
//    private UserMapper userMapper;
//
//    public List<User> findUsers(){
//        return userMapper.findUsers();
//    }
//
//    public HashMap<String, Object> findUser(Long userNo){
//        return userMapper.selectUserByUserNo(userNo);
//    }
//
//    public User insertUser(User user){
//        return userMapper.insertUser(user);
//    }
//
//    public int updateUser(User user){
//        return userMapper.updateUser(user);
//    }
//
//    public int deleteUser(Long user_no){
//        // TODO: 1. 팔로워 모두 삭제
//        // 2. 유저에서 제거
//        return userMapper.deleteUser(user_no);
//    }
//
//    public int followUser(Follow follow){
//        return userMapper.insertFollow(follow);
//    }
//
//    public int unFollowUser(Follow follow){
//        return userMapper.deleteFollow(follow);
//    }
//}
