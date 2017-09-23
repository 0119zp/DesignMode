package zp.com.zpmodeldemo.Bridge;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 产品类 -- ipad
 */

public class IpadProduct extends Product{

    @Override
    public void beProducted() {
        LogUtils.getELog("生产ipad。。");
    }

    @Override
    public void sellProduct() {
        LogUtils.getELog("卖ipad。。");
    }
}
