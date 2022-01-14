package com.gsls.dome_mvc_mvp_mvvm.activity.bean;

/**
 * author：hello
 * time：2020/7/30
 * CSDN： qq_39799899
 * explain：
 **/
public class LoginBean {

    private String userName;
    private String passWord;

    public LoginBean() {
        super();
    }

    public LoginBean(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    @Override
    public String toString() {
        return "LoginBean{" +
                "userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }

}
