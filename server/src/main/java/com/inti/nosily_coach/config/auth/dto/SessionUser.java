package com.inti.nosily_coach.config.auth.dto;

import com.inti.nosily_coach.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
// SessionUser에는 인증된 사용자 정보만 필요하다.
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}