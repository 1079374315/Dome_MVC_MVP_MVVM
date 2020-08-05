package com.gsls.dome_mvc_mvp_mvvm.mvp.view;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;

/**
 * author：hello
 * time：2020/8/1
 * CSDN： qq_39799899
 * explain：
 **/
public interface IMVPView extends OnLoginCallback{

    LoginBean getLoginData();

}
