package com.zpan.design.Command;

/**
 * 增加需求命令
 */

public class AddCommand extends Command{
    // 命令方法
    @Override
    void execute() {
        xuqiuGroup.add();
        meigongGroup.add();
        codeGroup.add();
    }
}
