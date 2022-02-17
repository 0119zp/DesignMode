package com.zpan.design.FactoryMethod;

import com.zpan.design.SimpleFactory.MulOparation;
import com.zpan.design.SimpleFactory.Operation;

/**
 * 乘法工厂
 */

public class MulFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new MulOparation();
    }
}
