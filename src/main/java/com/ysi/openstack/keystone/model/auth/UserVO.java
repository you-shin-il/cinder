package com.ysi.openstack.keystone.model.auth;

public class UserVO {
    private DomainVO domain = new DomainVO();
    private String name;
    private String password;

    public UserVO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public DomainVO getDomain() {
        return domain;
    }

    public void setDomain(DomainVO domain) {
        this.domain = domain;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}