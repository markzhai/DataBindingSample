package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.github.markzhai.sample.databinding.ActivityExpressionBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class ExpressionActivity extends AppCompatActivity {

    private ActivityExpressionBinding mBinding;

    public class Presenter {
        public void onEmployeeClick(Employee employee) {
            Toast.makeText(ExpressionActivity.this, "onEmployeeClick",
                    Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this,
                R.layout.activity_expression);
        mBinding.setEmployee(new Employee("Zhai", "Mark"));
        mBinding.setPresenter(new Presenter());
    }
}
