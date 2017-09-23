package zp.com.zpmodeldemo.FactoryMethod;

import zp.com.zpmodeldemo.SimpleFactory.AddOperation;
import zp.com.zpmodeldemo.SimpleFactory.Operation;

/**
 * 加法工厂
 */

public class AddFactory implements IFactory{
    @Override
    public Operation creatOperation() {
        return new AddOperation();
    }
}
