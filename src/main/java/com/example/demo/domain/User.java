package com.example.demo.domain;

import io.swagger.annotations.ApiModel;

@ApiModel
public class User {
    private String username;
    private String level;
    private String sex;
    private String birth;
    private String email;
    private String authority;


    public User(String username, String level, String sex, String birth, String email, String authority) {
        this.username = username;
        this.level = level;
        this.sex = sex;
        this.birth = birth;
        this.email = email;
        this.authority = authority;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", level='" + level + '\'' +
                ", sex='" + sex + '\'' +
                ", birth='" + birth + '\'' +
                ", email='" + email + '\'' +
                ", authority='" + authority + '\'' +
                '}';
    }
}
