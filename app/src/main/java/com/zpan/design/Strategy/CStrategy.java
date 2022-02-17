package com.zpan.design.Strategy;

import com.zpan.design.LogUtils;

/**
 * 策略的具体实现三
 */

public class CStrategy implements IStrategy{
    @Override
    public void operate() {
        LogUtils.getELog("策略三");
    }
}
