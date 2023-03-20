package com.lucy.timeline.service;

import com.lucy.timeline.mapper.FollowMapper;
import com.lucy.timeline.mapper.UserMapper;
import com.lucy.timeline.model.Follow;
import com.lucy.timeline.model.User;
import com.lucy.timeline.model.dto.UserDetail;
import com.lucy.timeline.model.request.UserRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
@Transactional
public class UserService {

    private final UserMapper userMapper;
    private final FollowMapper followMapper;


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

    public void deleteUser(Long userId){
        followMapper.deleteFollowByUserId(userId);
        userMapper.deleteUser(userId);
    }

    public void followUser(Long userId, Long followUserId){

        if (followMapper.findFollow(userId, followUserId) ==  null) {
            followMapper.addFollow(new Follow(userId, followUserId));
        }
    }

    public void unFollowUser(Long userId, Long followUserId){
        followMapper.deleteFollow(userId, followUserId);
    }
}
