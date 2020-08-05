package com.gsls.dome_mvc_mvp_mvvm.mvp.presenter;

import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;
import com.gsls.dome_mvc_mvp_mvvm.mvp.model.MVP_Model;
import com.gsls.dome_mvc_mvp_mvvm.mvp.view.IMVPView;

/**
 * author：hello
 * time：2020/8/1
 * CSDN： qq_39799899
 * explain：
 **/
public class MVP_Presenter {

   private IMVPView imvpView;
   private MVP_Model mvp_model;

    public MVP_Presenter(IMVPView imvpView) {
        this.imvpView = imvpView;
        this.mvp_model = new MVP_Model();
    }

    public void getData(LoginBean loginBean){
        mvp_model.loginRequest(loginBean, new OnLoginCallback() {
            @Override
            public void onSuccess(LoginBean MVVMLoginBean) {
                imvpView.onSuccess(MVVMLoginBean);
            }

            @Override
            public void onError() {
                imvpView.onError();
            }
        });
    }

}
