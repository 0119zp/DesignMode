package com.zpan.design.FactoryMethod;

import com.zpan.design.SimpleFactory.Operation;
import com.zpan.design.SimpleFactory.SubOperation;

/**
 * 减法工厂
 */

public class SubFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new SubOperation();
    }
}
