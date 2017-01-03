package org.springframework.security.samples.user;

public class Account {
    private String username;
    private String password;
    private boolean enabled;
    private boolean admin;

    public Account(String username, String password, boolean enabled, boolean admin) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
        this.admin = admin;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAdmin() {
        return admin;
    }
}
