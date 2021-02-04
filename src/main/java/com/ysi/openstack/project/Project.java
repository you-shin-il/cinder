package com.ysi.openstack.project;

import java.util.List;

public class Project {
    private Links links;
    private java.util.List<ProjectVO> projects;

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public List<ProjectVO> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectVO> projects) {
        this.projects = projects;
    }
}