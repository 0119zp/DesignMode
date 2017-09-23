package zp.com.zpmodeldemo.Bridge;

import android.util.Log;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 产品类 -- 房子
 */

public class HouseProduct extends Product{

    @Override
    public void beProducted() {
        LogUtils.getELog("造房子。。");
    }

    @Override
    public void sellProduct() {
        LogUtils.getELog("卖房子。。");
    }
}
