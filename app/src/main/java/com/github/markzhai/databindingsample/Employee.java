package com.github.markzhai.databindingsample;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableBoolean;

/**
 * @author markzhai on 16/6/26
 * @version 1.3.0
 */
public class Employee extends BaseObservable {

    private String mLastName;
    private String mFirstName;

    public ObservableArrayMap<String, String> user = new ObservableArrayMap<>();

    public ObservableBoolean isFired = new ObservableBoolean();

    public Employee(String lastName, String firstName) {
        mLastName = lastName;
        mFirstName = firstName;
        isFired.set(false);
        user.put("hello", "world");
        user.put("hi", "world");
        user.put("yo", "world");
    }

    @Bindable
    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
        notifyPropertyChanged(com.github.markzhai.databindingsample.BR.lastName);
    }

    @Bindable
    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
        notifyPropertyChanged(com.github.markzhai.databindingsample.BR.firstName);
    }

    public void setFired(boolean fired) {
        isFired.set(fired);
    }
}
