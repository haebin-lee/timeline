package com.lucy.timeline.model.response;

import com.lucy.timeline.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class UserResponse {

    protected Long id;
    protected String name;
    protected LocalDateTime joinedAt;

    public UserResponse(User user) {
        if (user != null) {
            this.id = user.getId();
            this.name = user.getName();
            this.joinedAt = user.getJoinedAt();
        }
    }

}
