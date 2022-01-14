package com.gsls.dome_mvc_mvp_mvvm.activity.callback;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;

/**
 * author：hello
 * time：2020/7/30
 * CSDN： qq_39799899
 * explain：
 **/
public interface OnLoginCallback {
    void onSuccess(LoginBean loginBean);

    void onError();
}
