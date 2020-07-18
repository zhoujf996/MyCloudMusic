package com.ixuea.cources.mycloudmusicproject.activity;


import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.ixuea.cources.mycloudmusicproject.R;
import butterknife.BindView;

//登录界面
public class LoginActivity extends BaseTitleActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}