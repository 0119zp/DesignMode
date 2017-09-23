package zp.com.zpmodeldemo.Command;

import zp.com.zpmodeldemo.LogUtils;

/**
 * 产品需求组
 */

public class XuqiuGroup extends Group{

    @Override
    void add() {
        LogUtils.getELog("需求组增加需求");
    }

    @Override
    void delete() {
        LogUtils.getELog("需求组删除需求");
    }

    @Override
    void chang() {
        LogUtils.getELog("需求组修改需求");
    }
}
