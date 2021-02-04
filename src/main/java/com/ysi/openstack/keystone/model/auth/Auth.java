package com.ysi.openstack.keystone.model.auth;

public class Auth {
    private AuthVO auth;

    public Auth(String name, String password, String id) {
        this.auth = new AuthVO(name, password, id);
    }

    public static class AuthVO {
        private IdentityVO identity;
        private ScopeVO scope;

        public AuthVO(String name, String password, String id) {
            UserVO user = new UserVO(name, password);
            ProjectVO project = new ProjectVO(id);

            this.identity = new IdentityVO(new PasswordVO(user));
            this.scope = new ScopeVO(project);
        }

        public IdentityVO getIdentity() {
            return identity;
        }

        public void setIdentity(IdentityVO identity) {
            this.identity = identity;
        }

        public ScopeVO getScope() {
            return scope;
        }

        public void setScope(ScopeVO scope) {
            this.scope = scope;
        }
    }

    public AuthVO getAuth() {
        return auth;
    }

    public void setAuth(AuthVO auth) {
        this.auth = auth;
    }
}