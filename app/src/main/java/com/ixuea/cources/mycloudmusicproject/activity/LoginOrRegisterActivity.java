package com.ixuea.cources.mycloudmusicproject.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.ixuea.cources.mycloudmusicproject.R;


//登录注册界面
public class LoginOrRegisterActivity extends BaseCommonActivity implements View.OnClickListener {

    private static final String TAG = "LoginOrRegisterActivity";
    //登录按钮
    private Button bt_login;
    //注册按钮
    private Button bt_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_or_register);
    }

    @Override
    protected void initViews() {
        super.initViews();
        //登录按钮
        bt_login = findViewById(R.id.bt_login);
        //注册按钮
        bt_register = findViewById(R.id.bt_register);
    }

    @Override
    protected void initListeners() {
        super.initListeners();
        bt_login.setOnClickListener(this);
        bt_register.setOnClickListener(this);
    }

    //点击回调方法
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //登录按钮
            case R.id.bt_login:
                Log.d(TAG, "onClick: login");
                
                startActivity(LoginActivity.class);
                break;
            //注册按钮
            case R.id.bt_register:
                Log.d(TAG, "onClick: register");
                break;
        }
    }
}