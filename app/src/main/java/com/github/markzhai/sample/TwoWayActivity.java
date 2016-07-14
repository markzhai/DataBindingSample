package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.markzhai.sample.databinding.ActivityTwoWayBinding;
import com.github.markzhai.sample.BR;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class TwoWayActivity extends AppCompatActivity {

    ActivityTwoWayBinding mBinding;

    FormModel mModel = new FormModel("markzhai", "123456");

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way);
        mBinding.setPresenter(new Presenter());

        mBinding.setModel(mModel);
        mModel.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable observable, int i) {
                if (i == BR.name) {
                    Toast.makeText(TwoWayActivity.this, "name changed",
                            Toast.LENGTH_SHORT).show();
                } else if (i == BR.password) {
                    Toast.makeText(TwoWayActivity.this, "password changed",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public class Presenter {
        public void save(FormModel model) {
            Toast.makeText(TwoWayActivity.this, "saved",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
