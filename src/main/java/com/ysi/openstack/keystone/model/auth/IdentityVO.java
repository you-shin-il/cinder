package com.ysi.openstack.keystone.model.auth;

import java.util.Arrays;
import java.util.List;

public class IdentityVO {
    private final List<String> methods = Arrays.asList("password");
    private PasswordVO password;

    public IdentityVO(PasswordVO password) {
        this.password = password;
    }

    public List<String> getMethods() {
        return methods;
    }

    public PasswordVO getPassword() {
        return password;
    }

    public void setPassword(PasswordVO password) {
        this.password = password;
    }
}