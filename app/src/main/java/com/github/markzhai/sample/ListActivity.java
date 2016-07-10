package com.github.markzhai.sample;

import android.databinding.DataBindingUtil;
import android.databinding.OnRebindCallback;
import android.databinding.ViewDataBinding;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.github.markzhai.sample.databinding.ActivityListBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * @author markzhai on 16/7/7
 * @version 1.0.0
 */
public class ListActivity extends AppCompatActivity {

    private ActivityListBinding mBinding;
    private EmployeeAdapter mListAdapter;

    public class Presenter {
        public void addItem(View view) {
            mListAdapter.addEmployee(new Employee("Zhai", "Mark2", false));
        }

        public void removeItem(View view) {
            mListAdapter.removeEmployee();
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_list);
        mBinding.addOnRebindCallback(new OnRebindCallback() {
            @Override
            public boolean onPreBind(ViewDataBinding binding) {
                ViewGroup sceneRoot = (ViewGroup) binding.getRoot();
                TransitionManager.beginDelayedTransition(sceneRoot);
                return true;
            }
        });
        mBinding.setPresenter(new Presenter());
        mListAdapter = new EmployeeAdapter(this);
        mBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        mBinding.recyclerView.setAdapter(mListAdapter);
        mListAdapter.setListener(new EmployeeAdapter.OnItemClickListener() {
            @Override
            public void onEmployeeClick(Employee employee) {
                Toast.makeText(ListActivity.this,
                        employee.getFirstName(), Toast.LENGTH_SHORT).show();
            }
        });
        List<Employee> demoList = new ArrayList<>();
        demoList.add(new Employee("Zhai", "Mark", false));
        demoList.add(new Employee("Ni", "Abner", false));
        demoList.add(new Employee("Zeng", "Dim", true));
        mListAdapter.addEmployees(demoList);
    }
}
