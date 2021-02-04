package com.ysi.openstack.keystone.model.auth;

public class ProjectVO {
    private DomainVO domain = new DomainVO();
    private String id; //projectId

    public ProjectVO(String id) {
        this.id = id;
    }

    public DomainVO getDomain() {
        return domain;
    }

    public void setDomain(DomainVO domain) {
        this.domain = domain;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}