package zp.com.zpmodeldemo.ChainOfReponsibility;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 儿子处理母亲的请求
 */

public class Son extends IHandler{

    public Son(int level) {
        super(level);
    }

    @Override
    public void response(IWomen iWomen) {
        LogUtils.getELog("母亲向儿子请求：逛街");
        LogUtils.getELog(iWomen.getRequest());
        LogUtils.getELog("儿子的回复：同意");
    }
}
