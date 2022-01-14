package com.gsls.dome_mvc_mvp_mvvm.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.gsls.dome_mvc_mvp_mvvm.R;
import com.gsls.dome_mvc_mvp_mvvm.activity.bean.LoginBean;
import com.gsls.dome_mvc_mvp_mvvm.mvp.presenter.MVP_Presenter;
import com.gsls.dome_mvc_mvp_mvvm.mvp.view.MVP_View;

/**
 * 主要负责初始化数据
 */
public class MVP_Activity extends AppCompatActivity implements View.OnClickListener, MVP_View {

    private TextView tv_showData;
    public EditText et_userName;
    public EditText et_passWord;
    private MVP_Presenter mvp_presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        tv_showData = findViewById(R.id.tv_showData);
        et_userName = findViewById(R.id.et_userName);
        et_passWord = findViewById(R.id.et_passWord);
        findViewById(R.id.btn_login).setOnClickListener(this);

        mvp_presenter = new MVP_Presenter(this);
    }

    @Override
    public void onClick(View v) {
        mvp_presenter.login(getLoginData());
    }

    @Override
    public LoginBean getLoginData() {
        String userName = et_userName.getText().toString();
        String passWord = et_passWord.getText().toString();
        return new LoginBean(userName, passWord);
    }

    @Override
    public void onSuccess(LoginBean MVVMLoginBean) {
        tv_showData.setText("登录成功:" + MVVMLoginBean.toString());
    }

    @Override
    public void onError() {
        tv_showData.setText("登录失败，账号密码错误！");
    }
}