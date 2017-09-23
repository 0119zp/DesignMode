package zp.com.zpmodeldemo.State;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 电梯关闭状态
 */

public class ClosingState extends LiftState{

    @Override
    public void open() {
        // 状态修改
        super.mContext.setLiftState(IContext.openingState);
        // 动作委托给OpeningState执行
        super.mContext.getLiftState().open();

    }

    @Override
    public void close() {
        LogUtils.getELog("电梯关闭了");
    }

    @Override
    public void run() {
        // 状态修改
        super.mContext.setLiftState(IContext.runningState);
        // 动作委托给RunningState执行
        super.mContext.getLiftState().run();
    }

    @Override
    public void stop() {
        // 状态修改
        super.mContext.setLiftState(IContext.stopingState);
        // 动作委托给StopingState执行
        super.mContext.getLiftState().stop();
    }
}
