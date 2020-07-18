package com.ixuea.cources.mycloudmusicproject.activity;


import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.ixuea.cources.mycloudmusicproject.R;
import butterknife.BindView;

//登录界面
public class LoginActivity extends BaseCommonActivity {

    //标题控件
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void initViews() {
        super.initViews();
        //初始化Toolbar
        setSupportActionBar(toolbar);
    }
}