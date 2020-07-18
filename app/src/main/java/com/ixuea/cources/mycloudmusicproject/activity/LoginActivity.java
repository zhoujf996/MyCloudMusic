package com.ixuea.cources.mycloudmusicproject.activity;


import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import com.ixuea.cources.mycloudmusicproject.R;
import com.ixuea.cources.mycloudmusicproject.util.LogUtil;
import com.ixuea.cources.mycloudmusicproject.util.ToastUtil;

import org.apache.commons.lang3.StringUtils;

import butterknife.BindView;
import butterknife.OnClick;
import es.dmoral.toasty.Toasty;

//登录界面
public class LoginActivity extends BaseTitleActivity {
    private static final String TAG = "LoginActivity";
    //用户名输入框
    @BindView(R.id.et_username)
    EditText et_username;
    //密码输入框
    @BindView(R.id.et_passwprd)
    EditText et_passwprd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    //    登录按钮点击了
    @OnClick(R.id.bt_login)
    public void onLoginClick(Button view) {
        LogUtil.d(TAG, "onLoginClick");
        //获取用户名
        //trim()去除输入时的空格
        String username = et_username.getText().toString().trim();
        //调用lang3包下的的StringUtils判断用户名是否为空
        if (StringUtils.isBlank(username)) {
            LogUtil.w(TAG, "onLoginClick username empty");
            //Toast.makeText(getMainActivity(), R.string.enter_username, Toast.LENGTH_SHORT).show();
            //Toasty.error(getMainActivity(), R.string.enter_username, Toast.LENGTH_SHORT).show();
            ToastUtil.errorShortToast(getMainActivity(), R.string.enter_username);
            //由于不希望再向下执行，所以调用return方法
            return;
        }
        //获取密码
        String password = et_passwprd.getText().toString().trim();
        //调用lang3包下的的StringUtils判断用户名是否为空
        if (TextUtils.isEmpty(password)) {
            LogUtil.w(TAG, "onLoginClick passwprd empty");
            //Toast.makeText(getMainActivity(), R.string.enter_password, Toast.LENGTH_SHORT).show();
            ToastUtil.errorShortToast(getMainActivity(), R.string.enter_password);
            //由于不希望再向下执行，所以调用return方法
            return;
        }
        //调用登录方法
        ToastUtil.successShortToast(getMainActivity(), R.string.login_success);
    }

    //    忘记密码按钮点击了
    @OnClick({R.id.bt_forget})
    public void onForgetPasswordClick() {
        LogUtil.d(TAG, "onForgetPasswordClick");
    }
}