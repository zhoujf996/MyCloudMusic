package com.ixuea.cources.mycloudmusicproject.util;

import android.util.Log;

import com.ixuea.cources.mycloudmusicproject.BuildConfig;

//日志工具类
//对Android日志API做一层简单的封装
public class LogUtil {
    //    是否调试状态
    public static final boolean isDebug = BuildConfig.DEBUG;

    public static void d(String tag, String value) {
        if (isDebug) {
            Log.d(tag, value);
        }
    }
}
