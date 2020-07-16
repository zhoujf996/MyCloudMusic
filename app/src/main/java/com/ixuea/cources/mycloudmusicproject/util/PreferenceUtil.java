package com.ixuea.cources.mycloudmusicproject.util;

import android.content.Context;
import android.content.SharedPreferences;

//偏好设置工具类
//是否登陆了，是否显示引导界面，用户Id
public class PreferenceUtil {
    //偏好设置文件名称
    private static final String NAME = "ixuea_my_cloud_music";
    //是否显示引导界面的key
    private static final String SHOW_GUIDE = "SHOW_GUIDE";
    //实例
    private static PreferenceUtil instance;

    //上下文
    private final Context context;
    private final SharedPreferences preferences;

    public PreferenceUtil(Context context) {
        //保存上下文
        this.context = context.getApplicationContext();
        //这样写有内存泄漏
        //因为当前工具类不会马上释放
        //如果当前工具类引用了界面实例
        //当界面关闭后
        //因为界面对应在这里还有引用
        //所以会导致界面对象不会被释放
        //this.context = context;

        //获取偏好设置
        preferences = this.context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
    }

    //偏好设置单例
    public static PreferenceUtil getInstance(Context context) {
        if (instance == null) {
            instance = new PreferenceUtil(context);
        }
        return instance;
    }

    //是否显示引导界面
    public boolean isShowGuide() {
        return preferences.getBoolean(SHOW_GUIDE, true);
    }

    //设置是否显示引导界面
    public void setShowGuide(boolean value) {
        preferences.edit().putBoolean(SHOW_GUIDE, value).commit();
    }
}
