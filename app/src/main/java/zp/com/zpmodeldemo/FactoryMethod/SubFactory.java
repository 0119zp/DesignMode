package zp.com.zpmodeldemo.FactoryMethod;

import zp.com.zpmodeldemo.SimpleFactory.Operation;
import zp.com.zpmodeldemo.SimpleFactory.SubOperation;

/**
 * 减法工厂
 */

public class SubFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new SubOperation();
    }
}
