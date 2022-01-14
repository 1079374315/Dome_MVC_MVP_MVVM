package com.gsls.dome_mvc_mvp_mvvm.mvp.view;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;

/**
 * author：hello
 * time：2020/8/1
 * CSDN： qq_39799899
 * explain：主要负责View数据的 获取 与 赋值
 **/
public interface MVP_View extends OnLoginCallback{

    LoginBean getLoginData();

}
