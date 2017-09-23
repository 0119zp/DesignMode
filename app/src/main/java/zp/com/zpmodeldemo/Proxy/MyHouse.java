package zp.com.zpmodeldemo.Proxy;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 真是主题类
 */

public class MyHouse implements House{
    @Override
    public void sellHouse() {
        LogUtils.getELog("我要卖房子");
    }
}
