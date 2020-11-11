package com.pqy.baselibrary.activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * BaseActivity
 * created by xiaojun at 2020/11/11
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        ButterKnife.bind(this);
        doOnCreate(savedInstanceState);
    }

    protected abstract int getLayoutId();

    protected abstract void doOnCreate(Bundle savedInstanceState);

}
