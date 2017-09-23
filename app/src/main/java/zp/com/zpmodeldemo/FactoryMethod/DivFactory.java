package zp.com.zpmodeldemo.FactoryMethod;

import zp.com.zpmodeldemo.SimpleFactory.DivOperation;
import zp.com.zpmodeldemo.SimpleFactory.Operation;

/**
 * 除法工厂
 */

public class DivFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new DivOperation();
    }
}
