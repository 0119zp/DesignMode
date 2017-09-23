package zp.com.zpmodeldemo.AbstractFactory;

/**
 *
 */

public class ZpFactory01 implements MyFactory {
    @Override
    public ProductA FactoryA() {
        return new ZpProductA01();
    }

    @Override
    public ProductB FactoryB() {
        return new ZpProductB01();
    }
}
