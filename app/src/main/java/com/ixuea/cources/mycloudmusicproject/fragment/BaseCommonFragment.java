package com.ixuea.cources.mycloudmusicproject.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ixuea.cources.mycloudmusicproject.activity.BaseCommonActivity;
import com.ixuea.cources.mycloudmusicproject.util.PreferenceUtil;

//通用公共fragment
public abstract class BaseCommonFragment extends BaseFragment {

    protected PreferenceUtil sp;

    //
    @Override
    protected void initDatum() {
        super.initDatum();
        //初始化偏好设置工具类
        sp = PreferenceUtil.getInstance(getMainActivity());
    }


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
        getMainActivity().finish();
    }

    //获取当前fragment所在的Activity
    public BaseCommonActivity getMainActivity() {
        return (BaseCommonActivity) getActivity();
    }
}
