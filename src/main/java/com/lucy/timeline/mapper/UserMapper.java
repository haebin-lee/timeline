package com.lucy.timeline.mapper;

import com.lucy.timeline.model.Follow;
import com.lucy.timeline.model.User;
import org.mapstruct.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface UserMapper {

    List<User> selectUserList();

    HashMap<String, Object> selectUserByUserNo(Long userNo);

    User insertUser(User user);

    int updateUser(User user);

    int deleteUser(Long userNo);

    int insertFollow(Follow follow);

    int deleteFollow(Follow follow);
}
