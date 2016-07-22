package com.github.markzhai.sample;

import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;

/**
 * @author markzhai on 16/7/14
 * @version 1.3.0
 */
public class BindingViewHolder<T extends ViewDataBinding>
        extends RecyclerView.ViewHolder {

    private T mBinding;

    public BindingViewHolder(T binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public T getBinding() {
        return mBinding;
    }
}
