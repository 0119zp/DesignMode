package com.zpan.design.Bridge;

import com.zpan.design.LogUtils;

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
