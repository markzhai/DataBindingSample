package com.github.markzhai.sample.component;

import android.widget.TextView;

import com.github.markzhai.sample.R;

/**
 * @author markzhai on 16/7/21
 * @version 1.3.0
 */
public class TestBindingAdapter extends MyBindingAdapter {

    @Override
    public void setText(TextView view, String value) {
        view.setText(value + " test");
    }

    @Override
    public void setTextColor(TextView view, int value) {
        if (value == view.getContext()
                .getResources()
                .getColor(R.color.textColorDay)) {
            view.setTextColor(view.getContext()
                    .getResources()
                    .getColor(R.color.textColorNight));
        }
    }
}