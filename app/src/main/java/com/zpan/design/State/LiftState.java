package com.zpan.design.State;

/**
 * 定义一个电梯的接口
 */

public abstract class LiftState {

    // 定义一个环境角色，也就是状态的改变引起功能的改变
    protected IContext mContext;

    public void setContext(IContext context){
        this.mContext = context;
    }
    // 电梯的开启动作
    public abstract void open();
    // 电梯的关闭动作
    public abstract void close();
    // 电梯的运行动作
    public abstract void run();
    // 电梯的停止动作
    public abstract void stop();

}
