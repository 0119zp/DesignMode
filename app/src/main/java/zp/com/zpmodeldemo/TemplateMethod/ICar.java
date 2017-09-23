package zp.com.zpmodeldemo.TemplateMethod;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 汽车的抽象类
 */

public abstract class ICar {

    // 抽象方法
    protected abstract void boom();

    protected abstract void strat();

    protected abstract void stop();

    // 模板方法
    public void run(){

        strat();

        // 钩子方法判断其中一步操作
        if (this.isBoom()){
            boom();
        }else {
            smail();
        }
        stop();
    }

    // 具体方法
    protected void smail(){
        LogUtils.getELog("车主笑了。。");
    }

    // 钩子方法 -- 默认鸣笛会响
    protected boolean isBoom(){
        return true;
    }

}
