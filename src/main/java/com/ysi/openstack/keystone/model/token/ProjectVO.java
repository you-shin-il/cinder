package com.ysi.openstack.keystone.model.token;

public class ProjectVO {
    private DomainVO domain = new DomainVO();
    private String id; //projectId
    private String name;

    public ProjectVO() {}

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}