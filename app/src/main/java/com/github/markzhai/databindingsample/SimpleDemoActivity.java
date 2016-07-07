package com.github.markzhai.databindingsample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.markzhai.databindingsample.databinding.ActivityDemoBinding;

public class SimpleDemoActivity extends AppCompatActivity {

    Employee employee = new Employee("Zhai", "Mark");

    ActivityDemoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo);
        binding.setEmployee(employee);
        binding.setPresenter(new Presenter());
        binding.viewStub.getViewStub().inflate();
    }

    public class Presenter {
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            employee.setFirstName(s.toString());
            employee.setFired(!employee.isFired.get());
//            binding.setEmployee(employee);
        }

        public void onClick(View view) {
            Toast.makeText(SimpleDemoActivity.this, "点到了", Toast.LENGTH_SHORT).show();
        }

        public void onClickListenerBinding(Employee employee) {
            Toast.makeText(SimpleDemoActivity.this, employee.getLastName(),
                    Toast.LENGTH_SHORT).show();
        }
    }
}
