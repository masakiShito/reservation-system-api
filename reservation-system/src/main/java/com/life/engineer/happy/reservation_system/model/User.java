package com.life.engineer.happy.reservation_system.model;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String username;
    private String password;
    private List<String> roles = new ArrayList<>(); // rolesフィールドに初期値を設定

    // getters and setters

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
