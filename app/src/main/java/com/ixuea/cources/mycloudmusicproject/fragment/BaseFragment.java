package com.ixuea.cources.mycloudmusicproject.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

//所有fragemnt的通用父类
public abstract class BaseFragment extends Fragment {

    //找控件
    protected void initViews() {

    }

    //设置数据
    protected void initDatum() {

    }

    //绑定监听器
    protected void initListeners() {

    }

    //返回要显示的view
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return getLayoutView(inflater, container, savedInstanceState);
    }

    //返回View
    protected abstract View getLayoutView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    //View创建完毕了
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews();
        initDatum();
        initListeners();
    }

    //找控件
    //@IdRes作用是系统帮助校验参数
    //<T extends View> 泛型，可以传入不同类型的控件
    //<T extends View> 可以用object替换，但是调用的时候就要强制转换类型
    public final <T extends View> T findViewById(@IdRes int id){
        return getView().findViewById(id);
    }
}
