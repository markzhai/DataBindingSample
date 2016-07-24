package com.github.markzhai.sample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.github.markzhai.sample.component.ProductionComponent;
import com.github.markzhai.sample.component.TestComponent;
import com.github.markzhai.sample.databinding.ActivityMainBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;

    public class Presenter {
        public void onClickSimpleDemo(View view) {
            startActivity(new Intent(MainActivity.this, SimpleActivity.class));
        }
        public void onClickListDemo(View view) {
            startActivity(new Intent(MainActivity.this, ListActivity.class));
        }
        public void onClickTwoWayDemo(View view) {
            startActivity(new Intent(MainActivity.this, TwoWayActivity.class));
        }
        public void onClickExpressionDemo(View view) {
            startActivity(new Intent(MainActivity.this, ExpressionActivity.class));
        }
        public void onClickAnimationDemo(View view) {
            startActivity(new Intent(MainActivity.this, AnimationActivity.class));
        }
        public void onClickLambdaDemo(View view) {
            startActivity(new Intent(MainActivity.this, LambdaActivity.class));
        }
        public void onClickInjectDemo(View view) {
            if (DemoApplication.isTest) {
                DataBindingUtil.setDefaultComponent(new ProductionComponent());
            } else {
                DataBindingUtil.setDefaultComponent(new TestComponent());
            }
            DemoApplication.isTest = !DemoApplication.isTest;
            recreate();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.setPresenter(new Presenter());
    }
}
