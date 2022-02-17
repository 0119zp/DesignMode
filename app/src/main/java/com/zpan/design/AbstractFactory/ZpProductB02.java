package com.zpan.design.AbstractFactory;

import com.zpan.design.LogUtils;

/**
 *
 */

public class ZpProductB02 implements ProductB{
    @Override
    public void methodB1() {
        LogUtils.getELog("ZpProductB02 == methodB1");
    }

    @Override
    public void methodB2() {
        LogUtils.getELog("ZpProductB02 == methodB2");
    }
}
