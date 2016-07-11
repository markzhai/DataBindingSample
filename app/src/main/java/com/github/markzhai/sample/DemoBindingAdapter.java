package com.github.markzhai.sample;

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * @author markzhai on 16/7/8
 * @version 1.0.0
 */
public class DemoBindingAdapter {

    @BindingAdapter({"app:imageUri", "app:placeholder"})
    public static void loadImageFromUri(ImageView view, String url, Drawable placeholder) {
        Glide.with(view.getContext())
                .load(url)
                .placeholder(placeholder)
                .into(view);
    }
}
