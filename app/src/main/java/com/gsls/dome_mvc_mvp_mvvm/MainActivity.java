package com.gsls.dome_mvc_mvp_mvvm;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.gsls.dome_mvc_mvp_mvvm.dome.Demo_Activity;
import com.gsls.dome_mvc_mvp_mvvm.mvc.MVC_Activity;
import com.gsls.dome_mvc_mvp_mvvm.mvp.MVP_Activity;
import com.gsls.dome_mvc_mvp_mvvm.mvvm.view.MVVM_Activity;
import com.gsls.gt.GT;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_dome).setOnClickListener(this);
        findViewById(R.id.btn_mvc).setOnClickListener(this);
        findViewById(R.id.btn_mvp).setOnClickListener(this);
        findViewById(R.id.btn_mvvm).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_dome:
                GT.log("单击 btn_dome");
                startActivity(new Intent(MainActivity.this, Demo_Activity.class));
                break;

            case R.id.btn_mvc:
                GT.log("单击 btn_mvc");
                startActivity(new Intent(MainActivity.this, MVC_Activity.class));
                break;

            case R.id.btn_mvp:
                GT.log("单击 btn_mvp");
                startActivity(new Intent(MainActivity.this, MVP_Activity.class));
                break;

            case R.id.btn_mvvm:
                GT.log("单击 btn_mvvm");
                startActivity(new Intent(MainActivity.this, MVVM_Activity.class));
                break;

        }
    }
}