package com.github.markzhai.databindingsample;

import android.databinding.DataBindingUtil;
import android.databinding.adapters.TextViewBindingAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.markzhai.databindingsample.databinding.ActivityDemoBinding;

public class DemoActivity extends AppCompatActivity {

    Employee employee = new Employee("Zhai", "Mark");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityDemoBinding binding =
                DataBindingUtil.setContentView(this, R.layout.activity_demo);
        binding.setEmployee(employee);
        binding.setWatcher(new TextViewBindingAdapter.OnTextChanged() {
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                employee.setFirstName(s.toString());
                binding.setEmployee(employee);
            }
        });
    }
}
