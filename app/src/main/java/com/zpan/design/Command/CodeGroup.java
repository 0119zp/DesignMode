package com.zpan.design.Command;

import com.zpan.design.LogUtils;

/**
 * 开发组
 */

public class CodeGroup extends Group{
    @Override
    void add() {
        LogUtils.getELog("开发组增加需求");
    }

    @Override
    void delete() {
        LogUtils.getELog("开发组删除需求");
    }

    @Override
    void chang() {
        LogUtils.getELog("开发组修改需求");
    }
}
