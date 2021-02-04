package com.ysi.openstack.keystone.model.auth;

public class PasswordVO {
    private UserVO user;

    public PasswordVO(UserVO user) {
        this.user = user;
    }

    public UserVO getUser() {
        return user;
    }

    public void setUser(UserVO user) {
        this.user = user;
    }
}
