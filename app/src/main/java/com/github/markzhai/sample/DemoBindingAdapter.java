package com.github.markzhai.sample;

import android.databinding.BindingAdapter;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.databinding.InverseBindingListener;
import android.databinding.InverseBindingMethod;
import android.databinding.InverseBindingMethods;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

/**
 * @author markzhai on 16/7/8
 * @version 1.0.0
 */
@BindingMethods({    @BindingMethod(
        type = CompoundButton.class,
        attribute = "android:buttonTint",
        method = "setButtonTintList"
),     @BindingMethod(
        type = CompoundButton.class,
        attribute = "android:onCheckedChanged",
        method = "setOnCheckedChangeListener"
)})
@InverseBindingMethods({    @InverseBindingMethod(
        type = CompoundButton.class,
        attribute = "android:checked"
)})
public class DemoBindingAdapter {


    @BindingAdapter({"android:checked"})
    public static void setChecked(CompoundButton view, boolean checked) {
        if(view.isChecked() != checked) {
            view.setChecked(checked);
        }

    }

    @BindingAdapter(
            value = {"android:onCheckedChanged", "android:checkedAttrChanged"},
            requireAll = false
    )
    public static void setListeners(CompoundButton view, final OnCheckedChangeListener listener, final InverseBindingListener attrChange) {
        if(attrChange == null) {
            view.setOnCheckedChangeListener(listener);
        } else {
            view.setOnCheckedChangeListener(new OnCheckedChangeListener() {
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if(listener != null) {
                        listener.onCheckedChanged(buttonView, isChecked);
                    }

                    attrChange.onChange();
                }
            });
        }

    }
}
