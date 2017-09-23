package zp.com.zpmodeldemo.State;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 电梯停止状态
 */

public class StopingState extends LiftState{

    @Override
    public void open() {
        super.mContext.setLiftState(IContext.openingState);
        super.mContext.getLiftState().open();
    }

    @Override
    public void close() {
        LogUtils.getELog("你走了吗？");
    }

    @Override
    public void run() {
        super.mContext.setLiftState(IContext.runningState);
        super.mContext.getLiftState().run();
    }

    @Override
    public void stop() {
        LogUtils.getELog("电梯停止了");
    }
}
