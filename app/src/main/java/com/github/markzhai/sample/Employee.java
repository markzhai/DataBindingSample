package com.github.markzhai.sample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;

/**
 * @author markzhai on 16/6/26
 * @version 1.0.0
 */
public class Employee extends BaseObservable {

    private String mLastName;
    private String mFirstName;

    public ObservableArrayMap<String, String> user = new ObservableArrayMap<>();

    private String mAvatar;

    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String lastName, String firstName) {
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(false);
    }

    public Employee(String lastName, String firstName, boolean fired) {
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(fired);
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(com.github.markzhai.sample.BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(com.github.markzhai.sample.BR.firstName);
    }

    public void setFired(boolean fired) {
        isFired.set(fired);
    }

    @Bindable
    public String getAvatar() {
        return mAvatar;
    }

    public void setAvatar(String avatar) {
        mAvatar = avatar;
    }
}
