package com.github.markzhai.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.markzhai.databindingsample.databinding.ActivityTwoWayBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.3.0
 */
public class TwoWayActivity extends AppCompatActivity {

    ActivityTwoWayBinding mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way);
        mBinding.setPresenter(new Presenter());
        mBinding.setModel(new FormModel("markzhai", "123456"));
    }

    public class Presenter {
        public void save(FormModel model) {

        }
    }
}
