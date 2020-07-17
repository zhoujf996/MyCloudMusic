package com.ixuea.cources.mycloudmusicproject.adapter;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ixuea.cources.mycloudmusicproject.fragment.GuideFragment;
import java.util.ArrayList;
import java.util.List;

//引导界面适配器
public class GuideAdapter extends BaseFragmentPagerAdapter<Integer> {
    //列表数据源
    protected List<Integer> datum = new ArrayList<>();

    //构造方法
    public GuideAdapter(Context context, @NonNull FragmentManager fm) {
        super(context,fm);
    }

    //返回当前位置fragment
    @NonNull
    @Override
    public Fragment getItem(int position) {
        return GuideFragment.newInstance(getData(position));
    }
}
