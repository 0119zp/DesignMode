package com.zpan.design.State;

import com.zpan.design.LogUtils;

/**
 * 电梯的开启状态
 */

public class OpeningState extends LiftState{

    @Override
    public void open() {
        LogUtils.getELog("电梯门开启");
    }

    @Override
    public void close() {
        // 状态修改
        super.mContext.setLiftState(IContext.closingState);
        // 动作委托给ClosingState执行
        super.mContext.getLiftState().close();

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
