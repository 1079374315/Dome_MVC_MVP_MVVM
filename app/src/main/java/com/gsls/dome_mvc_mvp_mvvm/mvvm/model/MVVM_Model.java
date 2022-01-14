package com.gsls.dome_mvc_mvp_mvvm.mvvm.model;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.SQL_Utils;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;

/**
 * author：hello
 * time：2020/8/5
 * CSDN： qq_39799899
 * explain：
 **/
public class MVVM_Model {

    //登录请求
    public void loginRequest(LoginBean loginBean, OnLoginCallback loginCallback) {
        if (SQL_Utils.userName.equals(loginBean.getUserName()) && SQL_Utils.passWord.equals(loginBean.getPassWord())) {
            //登录成功
            loginCallback.onSuccess(loginBean);
        } else {
            //登录失败
            loginCallback.onError();
        }
    }


}
