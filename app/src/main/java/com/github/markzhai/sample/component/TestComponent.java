package com.github.markzhai.sample.component;

import android.databinding.DataBindingComponent;

/**
 * @author markzhai on 16/7/21
 */
public class TestComponent implements DataBindingComponent {

    private MyBindingAdapter mAdapter = new TestBindingAdapter();

    @Override
    public MyBindingAdapter getMyBindingAdapter() {
        return mAdapter;
    }
}