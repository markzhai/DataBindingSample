package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import android.widget.Toast;

import com.github.markzhai.sample.databinding.ActivityListBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class ListActivity extends AppCompatActivity {

    ActivityListBinding mBinding;
    EmployeeAdapter mEmployeeAdapter;

    public class Presenter {
        public void onClickAddItem(View view) {
            mEmployeeAdapter.add(new Employee("haha", "1", false));
        }

        public void onClickRemoveItem(View view) {
            mEmployeeAdapter.remove();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_list);

        mBinding.setPresenter(new Presenter());

        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mEmployeeAdapter = new EmployeeAdapter(this);
        mBinding.recyclerView.setAdapter(mEmployeeAdapter);
        mEmployeeAdapter.setListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void onEmployeeClick(Employee employee) {
                Toast.makeText(ListActivity.this,
                        employee.getFirstName(), Toast.LENGTH_SHORT).show();
            }
        });
        List<Employee> demoList = new ArrayList<>();
        demoList.add(new Employee("Zhai", "Mark", false));
        demoList.add(new Employee("Zhai2", "Mark2", false));
        demoList.add(new Employee("Zhai3", "Mark3", true));
        demoList.add(new Employee("Zhai4", "Mark4", false));
        mEmployeeAdapter.addAll(demoList);
    }
}
