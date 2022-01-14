package com.gsls.dome_mvc_mvp_mvvm.mvc;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.gsls.dome_mvc_mvp_mvvm.R;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.activity.callback.OnLoginCallback;
import com.gsls.dome_mvc_mvp_mvvm.mvc.model.MVC_Model;

public class MVC_Activity extends AppCompatActivity implements View.OnClickListener {

    private TextView tv_showData;
    public EditText et_userName;
    public EditText et_passWord;
    private MVC_Model mvc_model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        mvc_model = new MVC_Model();
    }

    private void initView() {
        tv_showData = findViewById(R.id.tv_showData);
        et_userName = findViewById(R.id.et_userName);
        et_passWord = findViewById(R.id.et_passWord);
        findViewById(R.id.btn_login).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        mvc_model.loginRequest(getLoginData(), new OnLoginCallback() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onSuccess(LoginBean loginBean) {
                tv_showData.setText("登录成功:" + loginBean.toString());
            }

            @Override
            public void onError() {
                tv_showData.setText("登录失败，账号密码错误！");
            }
        });

    }

    //获取登录数据
    public LoginBean getLoginData() {
        String userName = et_userName.getText().toString();
        String passWord = et_passWord.getText().toString();
        return new LoginBean(userName, passWord);
    }

}