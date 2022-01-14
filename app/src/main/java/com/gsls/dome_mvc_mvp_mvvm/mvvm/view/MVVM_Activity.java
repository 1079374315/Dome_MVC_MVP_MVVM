package com.gsls.dome_mvc_mvp_mvvm.mvvm.view;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.gsls.dome_mvc_mvp_mvvm.R;
import com.gsls.dome_mvc_mvp_mvvm.databinding.ActivityMvvmBinding;
import com.gsls.dome_mvc_mvp_mvvm.mvvm.view_model.MVVM_ViewModel;

public class MVVM_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvvm);
        ActivityMvvmBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvm);
        MVVM_ViewModel mvvm_viewModel = new MVVM_ViewModel(getApplication(), binding);
        binding.setViewModel(mvvm_viewModel);
    }


}