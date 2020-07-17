package com.ixuea.cources.mycloudmusicproject.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import com.ixuea.cources.mycloudmusicproject.R;
import com.ixuea.cources.mycloudmusicproject.fragment.GuideFragment;

//引导界面适配器
public class GuideAdapter extends FragmentPagerAdapter {

    //构造方法
    public GuideAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    //返回当前位置fragment
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return GuideFragment.newInstance(R.drawable.guide2);
    }

    //返回有多少个
    @Override
    public int getCount() {
        return 10;
    }
}
