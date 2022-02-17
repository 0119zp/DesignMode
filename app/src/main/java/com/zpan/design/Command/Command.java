package com.zpan.design.Command;

/**
 * 命令抽象类
 */

public abstract class Command {

    // 定义出三个组，方便子类使用
    protected XuqiuGroup xuqiuGroup = new XuqiuGroup();
    protected MeigongGroup meigongGroup = new MeigongGroup();
    protected CodeGroup codeGroup = new CodeGroup();
    // 一个抽象方法，实现具体功能
    abstract void execute();

}
