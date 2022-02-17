package com.zpan.design.Proxy;

import com.zpan.design.LogUtils;

/**
 * 真是主题类
 */

public class MyHouse implements House{
    @Override
    public void sellHouse() {
        LogUtils.getELog("我要卖房子");
    }
}
