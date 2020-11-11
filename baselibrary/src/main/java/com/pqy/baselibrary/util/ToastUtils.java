package com.pqy.baselibrary.util;

import android.widget.Toast;

import com.pqy.baselibrary.application.MyApplication;

/**
 * Toast工具类
 * created by xiaojun at 2020/11/11
 */
public class ToastUtils {

    public static void show(String content){
        Toast.makeText(MyApplication.getInstance(),content,Toast.LENGTH_SHORT).show();
    }

}
