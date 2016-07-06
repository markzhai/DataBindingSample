package com.github.markzhai.databindingsample;

/**
 * @author markzhai on 16/6/26
 * @version 1.3.0
 */
public class Employee {

    private String mLastName;
    private String mFirstName;

    private boolean mIsFired = false;

    public Employee(String lastName, String firstName) {
        mLastName = lastName;
        mFirstName = firstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public void setLastName(String lastName) {
        mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public void setFirstName(String firstName) {
        mFirstName = firstName;
    }

    public boolean isFired() {
        return mIsFired;
    }

    public void setFired(boolean fired) {
        mIsFired = fired;
    }
}
