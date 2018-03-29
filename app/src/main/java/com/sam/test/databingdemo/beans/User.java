package com.sam.test.databingdemo.beans;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;

import com.sam.test.databingdemo.BR;

/**
 * Created by zhangshexin on 2018/3/26.
 */

public class User extends BaseObservable {
    public ObservableField<Integer> age = new ObservableField<>();

    public ObservableField<String> pwd=new ObservableField<>();

    private String userName;

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }
}
