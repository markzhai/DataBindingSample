package com.github.markzhai.sample;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.markzhai.sample.databinding.ActivityExpressionBinding;

import java.util.Random;

/**
 * https://avatars2.githubusercontent.com/u/1106500?v=3&s=460
 *
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class ExpressionActivity extends AppCompatActivity {

    ActivityExpressionBinding mBinding;

    Random mRandom = new Random(System.currentTimeMillis());

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Employee employee = new Employee("mark", "zhai");
        employee.setFired(mRandom.nextBoolean());
        employee.setAvatar("https://avatars2.githubusercontent.com/u/1106500?v=3&s=460");
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_expression);
        mBinding.setEmployee(employee);
    }
}
