package com.ixuea.cources.mycloudmusicproject.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ixuea.cources.mycloudmusicproject.R;
import com.ixuea.cources.mycloudmusicproject.util.Constant;


//引导界面
public class GuideFragment extends BaseCommonFragment {
    //图片控件
    private ImageView iv;

    //构造方法
    public GuideFragment() {
        // Required empty public constructor
    }

    //创建方法
    public static GuideFragment newInstance(int id) {
        //创建fragment
        GuideFragment fragment = new GuideFragment();
        //创建Bundle
        Bundle args = new Bundle();
        //添加
        args.putInt(Constant.ID, id);
        //讲Bundle设置到fragment
        fragment.setArguments(args);
        //返回fragment
        return fragment;
    }


    //返回要显示的view
    @Override
    protected View getLayoutView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_guide, container, false);
    }

    //找控件
    @Override
    protected void initViews() {
        super.initViews();
        //找控件
        iv = findViewById(R.id.iv);
    }

    @Override
    protected void initDatum() {
        super.initDatum();
        //取出传递的数据
        int id = getArguments().getInt(Constant.ID, -1);
        //判断数据格式
        if (id == -1) {
            //如果图片不存在
            //就关闭当前界面
            //但在我们这里不会发生该情况
            getActivity().finish();
            return;
        }
        //显示图片
        iv.setImageResource(id);
    }
}