package zp.com.zpmodeldemo.State;

/**
 * 环境角色
 */

public class IContext {

    // 定义出所有状态
    protected final static OpeningState openingState = new OpeningState();
    protected final static ClosingState closingState = new ClosingState();
    protected final static RunningState runningState = new RunningState();
    protected final static StopingState stopingState = new StopingState();

    // 定义一个当前状态
    private LiftState liftState;

    public LiftState getLiftState() {
        return liftState;
    }

    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
        this.liftState.setContext(this);
    }

    // 状态描述

    public void open(){
        liftState.open();
    }

    public void close(){
        liftState.close();
    }

    public void run(){
        liftState.run();
    }

    public void stop(){
        liftState.stop();
    }



}
