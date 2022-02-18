package com.zpan.design.singleton;

/**
 * @author zpan
 * date 2/18/22 10:07 AM
 *
 * description: TODO
 */
public class InstanceTwo {

    // 饿汉模式 -- 天生的线程安全

    private InstanceTwo() {
    }

    private static final InstanceTwo instance = new InstanceTwo();

    public static InstanceTwo getInstance() {
        return instance;
    }
}
