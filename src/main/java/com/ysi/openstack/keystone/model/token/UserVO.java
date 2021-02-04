package com.ysi.openstack.keystone.model.token;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserVO {
    @JsonProperty("password_expires_at")
    private String passwordExpiresAt;
    private DomainVO domainVO;
    private String id;
    private String name;

    public String getPasswordExpiresAt() {
        return passwordExpiresAt;
    }

    public void setPasswordExpiresAt(String passwordExpiresAt) {
        this.passwordExpiresAt = passwordExpiresAt;
    }

    public DomainVO getDomainVO() {
        return domainVO;
    }

    public void setDomainVO(DomainVO domainVO) {
        this.domainVO = domainVO;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
