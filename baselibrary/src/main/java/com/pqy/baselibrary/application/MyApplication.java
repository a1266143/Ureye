package com.pqy.baselibrary.application;

import android.app.Application;

import com.pqy.baselibrary.util.CameraUtils;

public class MyApplication extends Application {

    private static MyApplication sMyApplication;

    public static MyApplication getInstance(){
        return sMyApplication;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sMyApplication = this;
        CameraUtils.getInstance().init(this);
    }
}
