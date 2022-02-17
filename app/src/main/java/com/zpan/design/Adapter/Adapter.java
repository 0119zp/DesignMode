package com.zpan.design.Adapter;

import com.zpan.design.LogUtils;

/**
 * 适配器角色Adapter扩展了Adaptee,同时又实现了目标(Target)接口。
 * 由于Adaptee没有提供sampleOperation2()方法，而目标接口又要求这个方法，
 * 因此适配器角色Adapter实现了这个方法
 *
 *  -- 类适配器模式
 */

public class Adapter extends Adaptee implements Target{

    @Override
    public void sampleOperationB() {
        // 具体实现代码
        LogUtils.getELog("类适配器--");
    }
}
