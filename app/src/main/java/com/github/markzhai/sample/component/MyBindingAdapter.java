package com.github.markzhai.sample.component;

import android.databinding.BindingAdapter;
import android.widget.TextView;

/**
 * @author markzhai on 16/7/21
 * @version 1.3.0
 */
public abstract class MyBindingAdapter {

    @BindingAdapter("android:text")
    public abstract void setText(TextView view, String value);


    @BindingAdapter("android:textColor")
    public abstract void setTextColor(TextView view, int color);
}
