package com.ysi.openstack.keystone.model.token;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;
import java.util.List;

public class Token {
    private TokenVO token;

    public TokenVO getToken() {
        return token;
    }

    public void setToken(TokenVO token) {
        this.token = token;
    }

    public static class TokenVO {
        @JsonProperty("is_domain")
        private boolean isDomain;
        private List<String> methods;
        private List<RolesVO> roles;
        @JsonProperty("expires_at")
        private LocalDateTime expiresAt;
        private ProjectVO project;
        private List<CatalogVO> catalog;
        private UserVO user;
        @JsonProperty("audit_ids")
        private List<String> auditIds;
        private String issuedAt;

        public boolean isDomain() {
            return isDomain;
        }

        public void setDomain(boolean domain) {
            this.isDomain = domain;
        }

        public List<String> getMethods() {
            return methods;
        }

        public void setMethods(List<String> methods) {
            this.methods = methods;
        }

        public List<RolesVO> getRoles() {
            return roles;
        }

        public void setRoles(List<RolesVO> roles) {
            this.roles = roles;
        }

        public LocalDateTime getExpiresAt() {
            return expiresAt;
        }

        public void setExpiresAt(LocalDateTime expiresAt) {
            this.expiresAt = expiresAt;
        }

        public ProjectVO getProject() {
            return project;
        }

        public void setProject(ProjectVO project) {
            this.project = project;
        }

        public List<CatalogVO> getCatalog() {
            return catalog;
        }

        public void setCatalog(List<CatalogVO> catalog) {
            this.catalog = catalog;
        }

        public UserVO getUser() {
            return user;
        }

        public void setUser(UserVO user) {
            this.user = user;
        }

        public List<String> getAuditIds() {
            return auditIds;
        }

        public void setAuditIds(List<String> auditIds) {
            this.auditIds = auditIds;
        }

        public String getIssuedAt() {
            return issuedAt;
        }

        public void setIssuedAt(String issuedAt) {
            this.issuedAt = issuedAt;
        }
    }
}