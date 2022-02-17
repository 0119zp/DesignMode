package com.zpan.design.FactoryMethod;

import com.zpan.design.SimpleFactory.AddOperation;
import com.zpan.design.SimpleFactory.Operation;

/**
 * 加法工厂
 */

public class AddFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new AddOperation();
    }
}
