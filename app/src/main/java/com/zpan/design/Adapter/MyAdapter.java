package com.zpan.design.Adapter;

import com.zpan.design.LogUtils;

/**
 * 对象适配器模式
 */

public class MyAdapter {

    private Adaptee adaptee;

    public MyAdapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperationA(){
        adaptee.sampleOperationA();
    }

    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperationB(){
        LogUtils.getELog("对象适配器模式--");
    }


}
