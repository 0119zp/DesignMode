package com.zpan.design.Strategy;

import com.zpan.design.LogUtils;

/**
 * 策略的具体实现一
 */

public class AStrategy implements IStrategy{
    @Override
    public void operate() {
        LogUtils.getELog("策略一");
    }
}
