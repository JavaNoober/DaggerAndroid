package com.xiaoqi.demo;


import javax.inject.Inject;

//@Singleton
public class UserInfo {

    @Inject
    public UserInfo(){

    }

    private String userName;

    private String age;

    private int id;


    public int getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getUserName() {
        return userName;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
