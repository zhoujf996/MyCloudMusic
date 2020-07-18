package com.ixuea.cources.mycloudmusicproject.activity;

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
    }
}
