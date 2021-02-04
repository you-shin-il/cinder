package com.ysi.openstack.keystone.model.auth;

public class ScopeVO {
    protected ProjectVO project;

    public ScopeVO(ProjectVO project) {
        this.project = project;
    }

    public ProjectVO getProject() {
        return project;
    }

    public void setProject(ProjectVO project) {
        this.project = project;
    }
}