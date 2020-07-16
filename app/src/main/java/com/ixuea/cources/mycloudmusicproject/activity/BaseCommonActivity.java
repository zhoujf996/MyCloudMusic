package com.ixuea.cources.mycloudmusicproject.activity;

import android.content.Intent;

//通用界面逻辑
public class BaseCommonActivity extends BaseActivity {

    //启动界面
    //Class<？>表示类型不确定的类
    protected void startActivity(Class<?> clazz) {
        //创建Intent
        Intent intent = new Intent(getMainActivity(), clazz);

        //启动界面
        startActivity(intent);
    }

    //启动界面并关闭当前界面
    protected void startActivityAfterFinishThis(Class<?> clazz) {
        startActivity(clazz);
        //关闭当前界面
        finish();
    }

    //获取界面方法
    protected BaseCommonActivity getMainActivity() {
        return this;
    }
}
