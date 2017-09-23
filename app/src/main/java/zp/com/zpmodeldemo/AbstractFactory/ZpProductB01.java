package zp.com.zpmodeldemo.AbstractFactory;

import zp.com.zpmodeldemo.LogUtils;

/**
 *
 */

public class ZpProductB01 implements ProductB{
    @Override
    public void methodB1() {
        LogUtils.getELog("ZpProductB01 == methodB1");
    }

    @Override
    public void methodB2() {
        LogUtils.getELog("ZpProductB01 == methodB2");
    }
}
