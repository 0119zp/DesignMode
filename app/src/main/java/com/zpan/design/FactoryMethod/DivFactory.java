package com.zpan.design.FactoryMethod;

import com.zpan.design.SimpleFactory.DivOperation;
import com.zpan.design.SimpleFactory.Operation;

/**
 * 除法工厂
 */

public class DivFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new DivOperation();
    }
}
