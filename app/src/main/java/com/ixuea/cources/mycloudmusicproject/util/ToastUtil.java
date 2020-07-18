package com.ixuea.cources.mycloudmusicproject.util;

import android.content.Context;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;


import com.ixuea.cources.mycloudmusicproject.activity.BaseCommonActivity;

import es.dmoral.toasty.Toasty;

//Toast工具类
public class ToastUtil {

    //显示短时间错误toast
    public static void errorShortToast(@NonNull Context context, @StringRes int id) {
        Toasty.error(context, id, Toast.LENGTH_SHORT).show();
    }

    //显示长时间错误toast
    public static void errorLongToast(@NonNull Context context, @StringRes int id) {
        Toasty.error(context, id, Toast.LENGTH_LONG).show();
    }

    //显示短时间正确toast
    public static void successShortToast(@NonNull Context context, @StringRes int id) {
        Toasty.error(context, id, Toast.LENGTH_LONG).show();
    }
}
