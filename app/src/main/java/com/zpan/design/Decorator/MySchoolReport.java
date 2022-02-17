package com.zpan.design.Decorator;

import android.util.Log;

/**
 * 成绩单
 */

public class MySchoolReport extends SchoolReport{


    @Override
    public void report() {
        Log.e("zhang","我的成绩：语文90，数学98");
    }

    @Override
    public void sign(String name) {
        Log.e("zhang","家长签名：" + name);
    }
}
