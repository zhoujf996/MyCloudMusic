package com.ixuea.cources.mycloudmusicproject.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

import com.ixuea.cources.mycloudmusicproject.MainActivity;
import com.ixuea.cources.mycloudmusicproject.R;

//启动界面
public class SplashActivity extends BaseCommonActivity {
    private static final String TAG = "SplashActivity";
    //下一步常量
    private static final int MESSAGE_NEXT = 100;
    //默认延时时间
    private static final long DEFAULT_DELAY_TIME = 3000;


    //创建Handler
    //这样创建会有内存泄漏，以后会性能优化
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            switch (msg.what) {
                case MESSAGE_NEXT:
                    next();
                    break;
            }
        }
    };

    private void next() {
        Log.d(TAG, "next() ");
//        //创建Intent
//        Intent intent = new Intent(this, GuideActivity.class);
//        //启动界面
//        startActivity(intent);
//        //关闭当前界面
//        finish();

//        if (sp.isShowGuide()) {
            //使用重构后的方法
            startActivityAfterFinishThis(GuideActivity.class);
//        } else {
            //跳转到登录注册界面
//            startActivityAfterFinishThis(LoginOrRegisterActivity.class);
//        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //设置全屏
        fullScreen();

        ////延时3秒
        ////在企业中通常会有很多逻辑处理
        ////所以延时时间最好是用3-消耗的的时间
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                handler.sendEmptyMessage(MESSAGE_NEXT);
            }
        }, DEFAULT_DELAY_TIME);
    }

    @Override
    protected void initDatum() {
        super.initDatum();
//        //测试使用偏好设置
//        // 获取偏移设置对象
//        SharedPreferences preferences = getSharedPreferences("ixuea", MODE_PRIVATE);
//
//        //保存一个字符串"我们是爱学啊"
//        // 存储的键为：username
//        preferences.edit().putString("username", "我们是爱学啊").commit();
//
//        //通过键找到上面存储的值
//        String username = preferences.getString("username", null);
//
//        //打印出来，方便调试
//        Log.d(TAG, "initDatum: "+"第一次获取值"+username);
//
//        //删除该key对应的值
//        preferences.edit().remove("username").commit();
//
//        //再次获取
//        username=preferences.getString("username",null);
//        Log.d(TAG,"initDatum"+"删除后再次获取值"+username);
    }
}

