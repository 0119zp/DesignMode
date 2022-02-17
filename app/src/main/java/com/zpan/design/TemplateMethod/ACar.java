package com.zpan.design.TemplateMethod;

import com.zpan.design.LogUtils;

/**
 * 汽车 A 实现
 */

public class ACar extends ICar{

    private boolean isBoom = false;

    @Override
    protected void boom() {
        LogUtils.getELog("汽车 A 鸣笛了");
    }

    @Override
    protected void strat() {
        LogUtils.getELog("汽车 A 启动了");
    }

    @Override
    protected void stop() {
        LogUtils.getELog("汽车 A 刹车了");
    }

    @Override
    public boolean isBoom() {
        return this.isBoom;
    }

    public void setBoom(boolean isBoom){
        this.isBoom = isBoom;
    }
}
