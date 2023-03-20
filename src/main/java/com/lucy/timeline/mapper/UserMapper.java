package com.lucy.timeline.mapper;

import com.lucy.timeline.model.User;
import com.lucy.timeline.model.dto.UserDetail;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> findUsers();

    UserDetail findUser(Long userId);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(Long userId);


}
