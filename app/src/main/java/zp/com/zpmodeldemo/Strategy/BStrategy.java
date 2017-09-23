package zp.com.zpmodeldemo.Strategy;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 策略具体实现二
 */

public class BStrategy implements IStrategy{
    @Override
    public void operate() {
        LogUtils.getELog("策略二");
    }
}
