package zp.com.zpmodeldemo.Bridge;

import zp.com.zpmodeldemo.LogUtils;

/**
 *
 */

public class IpadCorp extends Corp{

    public IpadCorp(IpadProduct ipadProduct) {
        super(ipadProduct);
    }

    @Override
    public void makeMoney() {
        super.makeMoney();
        LogUtils.getELog("ipad挣钱了。。");
    }
}
