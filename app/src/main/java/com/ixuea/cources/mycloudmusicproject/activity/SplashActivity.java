package com.ixuea.cources.mycloudmusicproject.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;

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

        //使用重构后的方法
        startActivityAfterFinishThis(GuideActivity.class);
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


}


