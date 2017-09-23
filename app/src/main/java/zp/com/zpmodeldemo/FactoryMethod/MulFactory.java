package zp.com.zpmodeldemo.FactoryMethod;

import zp.com.zpmodeldemo.SimpleFactory.MulOparation;
import zp.com.zpmodeldemo.SimpleFactory.Operation;

/**
 * 乘法工厂
 */

public class MulFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new MulOparation();
    }
}
