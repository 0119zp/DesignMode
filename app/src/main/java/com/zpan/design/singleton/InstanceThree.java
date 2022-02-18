package com.zpan.design.singleton;

/**
 * 单例模式
 */
public class InstanceThree {

    // 私有化构造函数
    private InstanceThree() {
    }

    // 3、静态内部类
    // -- 实现了线程安全，又避免了同步带来的性能影响
    private static class Holder {
        private static final InstanceThree instance = new InstanceThree();
    }

    public static InstanceThree getInstance() {
        return Holder.instance;
    }
}
