package com.zpan.design.singleton;

/**
 * @author zpan
 * date 2/18/22 10:07 AM
 *
 * description: TODO
 */
public class InstanceOne {

    // 懒汉模式 -- 非线程安全，采用以下方式优化

    private InstanceOne() {
    }

    private volatile static InstanceOne instance;

    public static InstanceOne getInstance() {
        if (instance == null) {
            synchronized (InstanceOne.class) {
                if (instance == null) {
                    instance = new InstanceOne();
                }
            }
        }
        return instance;
    }
}
