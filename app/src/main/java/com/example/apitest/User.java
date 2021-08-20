package com.example.apitest;

public class User {
    private String profile;
    private String id;
    private int pw=0;
    private String userName;

    public User(){
        this.id="test";
        this.pw=1;
        this.userName="test";
    }

    public User(int pw){
        this.profile="test";
        this.id="test";
        this.pw=pw;
        this.userName="test";
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPw() {
        return pw;
    }

    public void setPw(int pw) {
        this.pw = pw;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
