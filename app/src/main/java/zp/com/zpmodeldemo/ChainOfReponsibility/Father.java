package zp.com.zpmodeldemo.ChainOfReponsibility;

import android.util.Log;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 父亲处理女儿的请求
 */

public class Father extends IHandler{

    public Father(int level) {
        super(level);
    }

    @Override
    public void response(IWomen iWomen) {

        LogUtils.getELog("女儿向父亲请求：逛街");
        LogUtils.getELog(iWomen.getRequest());
        LogUtils.getELog("父亲的回复：同意");
    }
}
