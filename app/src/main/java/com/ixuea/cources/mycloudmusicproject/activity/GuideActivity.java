package com.ixuea.cources.mycloudmusicproject.activity;

import android.os.Bundle;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.ixuea.cources.mycloudmusicproject.R;

//引导界面
public class GuideActivity extends AppCompatActivity {
    //当界面创建的时候
    //一定要注意：
    //要用onCreate的方法参数是Bundle的这个方法
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //将activity_guide布局设置当前Activity的界面
        //很明显也设置为其他布局文件
        setContentView(R.layout.activity_guide);

        //隐藏状态栏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}
