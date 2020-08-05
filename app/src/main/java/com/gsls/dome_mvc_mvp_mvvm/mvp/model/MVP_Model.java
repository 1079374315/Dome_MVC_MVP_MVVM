package com.gsls.dome_mvc_mvp_mvvm.mvp.model;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.SimulationData;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;

/**
 * author：hello
 * time：2020/7/31
 * CSDN： qq_39799899
 * explain：
 **/
public class MVP_Model {

    //登录请求
    public void loginRequest(LoginBean loginBean, OnLoginCallback loginCallback) {
        if (SimulationData.userName.equals(loginBean.getUserName()) && SimulationData.passWord.equals(loginBean.getPassWord())) {
            //登录成功
            loginCallback.onSuccess(loginBean);
        } else {
            //登录失败
            loginCallback.onError();
        }
    }


}
