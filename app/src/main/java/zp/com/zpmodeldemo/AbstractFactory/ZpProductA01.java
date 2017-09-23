package zp.com.zpmodeldemo.AbstractFactory;

import zp.com.zpmodeldemo.LogUtils;

/**
 *
 */

public class ZpProductA01 implements ProductA{
    @Override
    public void methodA1() {
        LogUtils.getELog("ZpProductA01 == methodA1");
    }

    @Override
    public void methodA2() {
        LogUtils.getELog("ZpProductA01 == methodA2");
    }
}
