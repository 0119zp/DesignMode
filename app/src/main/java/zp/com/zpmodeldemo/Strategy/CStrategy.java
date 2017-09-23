package zp.com.zpmodeldemo.Strategy;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 策略的具体实现三
 */

public class CStrategy implements IStrategy{
    @Override
    public void operate() {
        LogUtils.getELog("策略三");
    }
}
