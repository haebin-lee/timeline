package com.lucy.timeline.service;

import com.lucy.timeline.mapper.UserMapper;
import com.lucy.timeline.model.Follow;
import com.lucy.timeline.model.User;
import com.lucy.timeline.model.dto.UserDetail;
import com.lucy.timeline.model.request.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public List<User> findUsers(){
        return userMapper.findUsers();
    }

    public UserDetail findUser(Long userId){
        return userMapper.findUser(userId);
    }

    public void addUser(UserRequest request){
        User user = request.toModel();
        userMapper.addUser(user);
    }

    public void updateUser(User user){
        userMapper.updateUser(user);
    }

    public void deleteUser(Long user_no){
        // TODO: 1. 팔로워 모두 삭제
        // 2. 유저에서 제거
        userMapper.deleteUser(user_no);
    }

    public void followUser(Follow follow){
        userMapper.insertFollow(follow);
    }

    public void unFollowUser(Follow follow){
        userMapper.deleteFollow(follow);
    }
}
