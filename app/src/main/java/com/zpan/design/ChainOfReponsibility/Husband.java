package com.zpan.design.ChainOfReponsibility;

import com.zpan.design.LogUtils;

/**
 * 丈夫处理妻子的请求
 */

public class Husband extends IHandler{

    public Husband(int level) {
        super(level);
    }

    @Override
    public void response(IWomen iWomen) {
        LogUtils.getELog("妻子向丈夫请求：逛街");
        LogUtils.getELog(iWomen.getRequest());
        LogUtils.getELog("丈夫的回复：同意");
    }
}
