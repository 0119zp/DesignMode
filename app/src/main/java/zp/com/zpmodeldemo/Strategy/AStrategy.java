package zp.com.zpmodeldemo.Strategy;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 策略的具体实现一
 */

public class AStrategy implements IStrategy{
    @Override
    public void operate() {
        LogUtils.getELog("策略一");
    }
}
