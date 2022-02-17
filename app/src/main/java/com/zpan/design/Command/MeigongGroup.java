package com.zpan.design.Command;

import com.zpan.design.LogUtils;

/**
 * 美工组
 */

public class MeigongGroup extends Group{
    @Override
    void add() {
        LogUtils.getELog("美工组增加需求");
    }

    @Override
    void delete() {
        LogUtils.getELog("美工组删除需求");
    }

    @Override
    void chang() {
        LogUtils.getELog("美工组修改需求");
    }
}
