package com.ixuea.cources.mycloudmusicproject.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;

import com.ixuea.cources.mycloudmusicproject.MainActivity;
import com.ixuea.cources.mycloudmusicproject.R;
import com.ixuea.cources.mycloudmusicproject.adapter.GuideAdapter;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator;

//引导界面
public class GuideActivity extends BaseCommonActivity implements View.OnClickListener {

    private static final String TAG = "GuideActivity";
    //快捷键ctrl+alt+f快速生成
    //登录注册按钮
    private Button bt_login_or_register;

    //立即体验按钮
    private Button bt_enter;

    //左右滚动控件
    private ViewPager vp;

    //适配器
    private GuideAdapter adapter;
    //指示器
    private CircleIndicator ci;

    //当界面创建的时候
    //一定要注意：
    //要用onCreate的方法参数是Bundle的这个方法
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //将activity_guide布局设置当前Activity的界面
        //很明显也设置为其他布局文件
        setContentView(R.layout.activity_guide);

    }


    @Override
    protected void initViews() {
        super.initViews();
        //隐藏状态栏
        hidenStatusBar();
        //ViewPager控件
        vp = findViewById(R.id.vp);
        //指示器
        ci = findViewById(R.id.ci);

        //找控件
        //登录注册按钮
        bt_login_or_register = findViewById(R.id.bt_login_or_register);
        //立即注册按钮
        bt_enter = findViewById(R.id.bt_enter);

        //测试显示fragment
//        getSupportFragmentManager()
//                .beginTransaction()
//                .replace(R.id.container, GuideFragment.newInstance(R.drawable.guide2))
//                .commit();
    }

    @Override
    protected void initDatum() {
        super.initDatum();
        //创建适配器
        adapter = new GuideAdapter(getSupportFragmentManager());

        //设置适配器到控件
        vp.setAdapter(adapter);

        //让指示器根据列表控件配合工作
        ci.setViewPager(vp);

        //适配器注册数据源观察者
        adapter.registerDataSetObserver(ci.getDataSetObserver());

        //准备数据
        List<Integer> datum = new ArrayList<>();
        datum.add(R.drawable.guide1);
        datum.add(R.drawable.guide2);
        datum.add(R.drawable.guide3);
        datum.add(R.drawable.guide4);
        datum.add(R.drawable.guide5);

        //设置数据到适配器
        adapter.setDatum(datum);
    }

    @Override
    protected void initListeners() {
        super.initListeners();
        //设置点击事件
        //登录注册按钮
        bt_login_or_register.setOnClickListener(this);
        //立即体验按钮
        bt_enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //因为有很多个按钮都设置同一个监听器
        //所以这里需要区分到底是哪一个按钮点击
        switch (view.getId()) {
            //登录注册按钮点击
            case R.id.bt_login_or_register:
                Log.d(TAG, "onClick login or register");
                startActivity(LoginOrRegisterActivity.class);
                setShowGuide();
                break;
            //立即体验按钮点击
            case R.id.bt_enter:
                Log.d(TAG, "onClick enter");
                startActivity(MainActivity.class);
                setShowGuide();
                break;
        }
    }

    //设置不再显示引导界面
    private void setShowGuide() {
//        PreferenceUtil.getInstance(getMainActivity()).setShowGuide(false);
        sp.setShowGuide(false);
    }
}
