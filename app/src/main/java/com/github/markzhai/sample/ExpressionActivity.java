package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.markzhai.sample.databinding.ActivityExpressionBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class ExpressionActivity extends AppCompatActivity {

    private ActivityExpressionBinding mBinding;
    private Employee mEmployee = new Employee("Zhai", "Mark");

    public class Presenter {
        public void onEmployeeClick(Employee employee) {
            mEmployee.setFired(!mEmployee.isFired.get());
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_expression);
        mEmployee.setAvatar("https://avatars2.githubusercontent.com/u/1106500");
        mBinding.setEmployee(mEmployee);
        mBinding.setPresenter(new Presenter());
    }
}
