package com.pqy.baselibrary.util;

import android.util.Log;

/**
 * 日志工具类
 * created by xiaojun at 2020/11/7
 */
public class LogUtils {

    private static final String TAG = "xiaojun";

    public static void d(Class<?> tag,String message){
        Log.d(tag.getSimpleName(),message);
    }

    public static void e(Class<?> tag,String message){
        Log.e(tag.getSimpleName(),message);
    }

    public static void d(String msg){
        Log.d(TAG,msg);
    }

    public static void e(String msg){
        Log.e(TAG,msg);
    }

}
