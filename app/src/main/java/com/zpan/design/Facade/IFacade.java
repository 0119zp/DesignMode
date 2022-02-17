package com.zpan.design.Facade;

/**
 * 门面类
 */

public class IFacade {

    public void test(){
        // 测试类A
        ModuleA moduleA = new ModuleA();
        moduleA.testA();
        // 测试类B
        ModuleB moduleB = new ModuleB();
        moduleB.testB();
        // 测试类C
        ModuleC moduleC = new ModuleC();
        moduleC.testC();

    }

}
