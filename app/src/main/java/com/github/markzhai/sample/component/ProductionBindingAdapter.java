package com.github.markzhai.sample.component;

import android.databinding.adapters.TextViewBindingAdapter;
import android.widget.TextView;

/**
 * @author markzhai on 16/7/21
 * @version 1.3.0
 */
public class ProductionBindingAdapter extends MyBindingAdapter {

    @Override
    public void setText(TextView view, String value) {
        TextViewBindingAdapter.setText(view, value);
    }

    @Override
    public void setTextColor(TextView view, int value) {
        view.setTextColor(value);
    }
}