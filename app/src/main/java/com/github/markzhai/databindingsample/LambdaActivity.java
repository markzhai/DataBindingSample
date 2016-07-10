package com.github.markzhai.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.markzhai.databindingsample.databinding.ActivityLambdaBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class LambdaActivity extends AppCompatActivity {

    ActivityLambdaBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_lambda);

    }
}
