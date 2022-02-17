package com.zpan.design.ChainOfReponsibility;

import com.zpan.design.LogUtils;

/**
 * 父系社会 -- handler控制类
 */

public abstract class IHandler {

    // 女士类型
    private int level = 0;
    // 责任链传递 下一个责任人是谁
    private IHandler nextHandler;

    // 不同的类型，处理不同的请求
    public IHandler(int level){
        this.level = level;
    }

    // 处理请求（女儿、妻子、母亲）
    public final void handlerMessage(IWomen iWomen){
        if (iWomen.getType() == this.level){
            this.response(iWomen);
        }else {
            if (nextHandler != null){
                // 有后续环节，才把请求往后传递
                nextHandler.handlerMessage(iWomen);
            }else {
                // 没有后续人，就不做处理
                LogUtils.getELog("没有下一步了，不要请求了");
            }
        }
    }

    // 设置下一个责任人
    public void setNext(IHandler handler){
        this.nextHandler = handler;
    }

    // 对请求的回应
    public abstract void response(IWomen iWomen);



}
