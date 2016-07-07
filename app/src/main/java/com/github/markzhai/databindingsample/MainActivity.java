package com.github.markzhai.databindingsample;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.markzhai.databindingsample.databinding.ActivityMainBinding;

/**
 * @author markzhai on 16/7/7
 * @version 1.3.0
 */
public class MainActivity extends AppCompatActivity {

    public class Presenter {
        public void onClickSimpleDemo(View view) {
            startActivity(new Intent(MainActivity.this, SimpleDemoActivity.class));
        }
        public void onClickListDemo(View view) {
            startActivity(new Intent(MainActivity.this, ListDemoActivity.class));
        }
        public void onClickTwoWayDemo(View view) {
            startActivity(new Intent(MainActivity.this, TwoWayDemoActivity.class));
        }
        public void onClickExpressionDemo(View view) {
            startActivity(new Intent(MainActivity.this, ExpressionDemoActivity.class));
        }
        public void onClickAnimationDemo(View view) {
            startActivity(new Intent(MainActivity.this, AnimationDemoActivity.class));
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setPresenter(new Presenter());
    }
}
