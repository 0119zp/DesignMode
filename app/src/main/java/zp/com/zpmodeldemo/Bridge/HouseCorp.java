package zp.com.zpmodeldemo.Bridge;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 产品类
 */

public class HouseCorp extends Corp{

    public HouseCorp(HouseProduct houseProduct) {
        super(houseProduct);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        LogUtils.getELog("开始挣钱了。。");
    }
}
