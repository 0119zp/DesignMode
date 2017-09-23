package zp.com.zpmodeldemo.Strategy;

/**
 * 调用策略
 */

public class ZpContext {

    IStrategy iStrategy = null;

    public ZpContext(IStrategy strategy){
        this.iStrategy = strategy;
    }

    public void setOperate(){
        iStrategy.operate();
    }

}
