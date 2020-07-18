package com.ixuea.cources.mycloudmusicproject.activity;

import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;

import com.ixuea.cources.mycloudmusicproject.R;

import butterknife.BindView;

//通用标题界面
public class BaseTitleActivity extends BaseCommonActivity {
    //标题控件
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void initViews() {
        super.initViews();
        //初始化Toolbar
        setSupportActionBar(toolbar);

        //是否显示返回按钮
        if (isShowBackMenu()) {
            //显示返回按钮
            showBackMenu();
        }
    }

    //显示返回按钮
    protected void showBackMenu() {
        //设置为 显示返回按钮
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //是否显示返回按钮
    protected boolean isShowBackMenu() {
        return true;
    }

    //菜单点击了回调
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            //Toolbar返回按钮点击 固定写法
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
