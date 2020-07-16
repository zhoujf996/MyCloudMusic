package com.ixuea.cources.mycloudmusicproject.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.ixuea.cources.mycloudmusicproject.R;

//引导界面
public class GuideActivity extends BaseCommonActivity implements View.OnClickListener {

    private static final String TAG = "GuideActivity";
    //快捷键ctrl+alt+f快速生成
    //登录注册按钮
    private Button bt_login_or_register;
    private Button bt_enter;

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
        //找控件
        //登录注册按钮
        bt_login_or_register = findViewById(R.id.bt_login_or_register);
        //立即注册按钮
        bt_enter = findViewById(R.id.bt_enter);
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
            case R.id.bt_login_or_register:
                Log.d(TAG, "onClick login or register");
                startActivity(LoginOrRegisterActivity.class);
                break;
            case R.id.bt_enter:
                Log.d(TAG, "onClick enter");
                break;
        }
    }
}
