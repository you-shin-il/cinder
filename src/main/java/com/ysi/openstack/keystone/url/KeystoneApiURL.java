package com.ysi.openstack.keystone.url;

public enum KeystoneApiURL {
    AUTH_TOKENS("/v3/auth/tokens"),
    AUTH_PROJECTS("/v3/auth/projects");

    private String url;

    KeystoneApiURL(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}