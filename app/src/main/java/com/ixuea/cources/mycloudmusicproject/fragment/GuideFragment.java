package com.ixuea.cources.mycloudmusicproject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ixuea.cources.mycloudmusicproject.R;


//引导界面
public class GuideFragment extends Fragment {

    //构造方法
    public GuideFragment() {
        // Required empty public constructor
    }

    //创建方法
    public static GuideFragment newInstance() {
        GuideFragment fragment = new GuideFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    //返回要显示的view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_guide, container, false);
    }
}