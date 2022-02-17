package com.zpan.design.State;

import com.zpan.design.LogUtils;

/**
 * 电梯运行状态
 */

public class RunningState extends LiftState{
    @Override
    public void open() {

    }

    @Override
    public void close() {

    }

    @Override
    public void run() {
        LogUtils.getELog("电梯运行了");
    }

    @Override
    public void stop() {
        super.mContext.setLiftState(IContext.stopingState);
        super.mContext.getLiftState().stop();

    }
}
