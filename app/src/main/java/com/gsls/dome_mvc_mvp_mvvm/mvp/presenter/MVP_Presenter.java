package com.gsls.dome_mvc_mvp_mvvm.mvp.presenter;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;
import com.gsls.dome_mvc_mvp_mvvm.mvp.model.MVP_Model;
import com.gsls.dome_mvc_mvp_mvvm.mvp.view.MVP_View;

/**
 * author：hello
 * time：2020/8/1
 * CSDN： qq_39799899
 * explain：
 **/
public class MVP_Presenter {

    private MVP_View mvp_view;
    private MVP_Model mvp_model;

    public MVP_Presenter(MVP_View mvp_view) {
        this.mvp_view = mvp_view;
        this.mvp_model = new MVP_Model();
    }

    public void login(LoginBean loginBean) {
        mvp_model.loginRequest(loginBean, new OnLoginCallback() {
            @Override
            public void onSuccess(LoginBean MVVMLoginBean) {
                mvp_view.onSuccess(MVVMLoginBean);
            }

            @Override
            public void onError() {
                mvp_view.onError();
            }
        });
    }

}
