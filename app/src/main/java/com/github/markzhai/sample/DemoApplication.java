package com.github.markzhai.sample;

import android.app.Application;
import android.databinding.DataBindingUtil;

import com.github.markzhai.sample.component.ProductionComponent;

/**
 * @author markzhai on 16/7/22
 * @version 1.3.0
 */
public class DemoApplication extends Application {

    public static boolean isTest = false;

    @Override
    public void onCreate() {
        super.onCreate();
        DataBindingUtil.setDefaultComponent(new ProductionComponent());
    }
}
