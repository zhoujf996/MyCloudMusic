package com.ixuea.cources.mycloudmusicproject.util;

import static com.ixuea.cources.mycloudmusicproject.util.Constant.REGEX_PHONE;

//字符串相关工具类
public class StringUtil {

    //是否是手机号
    public static boolean isPhone(String value){
        //实现手机号格式判断
        return value.matches(REGEX_PHONE);
    }
}
