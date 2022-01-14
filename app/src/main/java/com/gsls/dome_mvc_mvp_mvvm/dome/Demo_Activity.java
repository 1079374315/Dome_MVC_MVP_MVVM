package com.gsls.dome_mvc_mvp_mvvm.dome;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gsls.dome_mvc_mvp_mvvm.R;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.SQL_Utils;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;

public class Demo_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_showData;
    private EditText et_userName;
    private EditText et_passWord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
    }

    private void initView() {
        tv_showData = findViewById(R.id.tv_showData);
        et_userName = findViewById(R.id.et_userName);
        et_passWord = findViewById(R.id.et_passWord);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        loginRequest(getLoginData(), new OnLoginCallback() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSuccess(LoginBean MVVMLoginBean) {
                tv_showData.setText("登录成功:" + MVVMLoginBean.toString());
            }

            @Override
            public void onError() {
                tv_showData.setText("登录失败，账号密码错误！");
            }
        });
    }

    //获取登录数据
    private LoginBean getLoginData() {
        String userName = et_userName.getText().toString();
        String passWord = et_passWord.getText().toString();
        return new LoginBean(userName, passWord);
    }

    //登录请求
    private void loginRequest(LoginBean MVVMLoginBean, OnLoginCallback loginCallback) {
        if (SQL_Utils.userName.equals(MVVMLoginBean.getUserName()) && SQL_Utils.passWord.equals(MVVMLoginBean.getPassWord())) {
            //登录成功
            loginCallback.onSuccess(MVVMLoginBean);
        } else {
            //登录失败
            loginCallback.onError();
        }
    }

}