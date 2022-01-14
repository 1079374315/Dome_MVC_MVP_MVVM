package com.gsls.dome_mvc_mvp_mvvm.mvvm.view_model;

import android.app.Application;
import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.gsls.dome_mvc_mvp_mvvm.BR;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;
import com.gsls.dome_mvc_mvp_mvvm.databinding.ActivityMvvmBinding;
import com.gsls.dome_mvc_mvp_mvvm.mvvm.model.MVVM_Model;

/**
 * author：hello
 * time：2020/8/5
 * CSDN： qq_39799899
 * explain：
 **/
public class MVVM_ViewModel extends BaseObservable {

    private MVVM_Model mvvmModel;
    private String result;
    private ActivityMvvmBinding binding;
    private Application application;

    @Bindable
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
        notifyPropertyChanged(BR.result);
    }

    public MVVM_ViewModel(Application application, ActivityMvvmBinding binding) {
        mvvmModel = new MVVM_Model();
        this.binding = binding;
        this.application = application;
    }

    public void getData(View view) {
        mvvmModel.loginRequest(new LoginBean(binding.etUserName.getText().toString(), binding.etPassWord.getText().toString()), new OnLoginCallback() {
            @Override
            public void onSuccess(LoginBean loginBean) {
                setResult("获取成功:" + loginBean.toString());
            }

            @Override
            public void onError() {
                setResult("获取失败：账号或密码错误！");
            }
        });
    }

}
