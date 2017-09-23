package zp.com.zpmodeldemo.AbstractFactory;

/**
 *
 */

public class ZpFactory02 implements MyFactory {
    @Override
    public ProductA FactoryA() {
        return new ZpProductA02();
    }

    @Override
    public ProductB FactoryB() {
        return new ZpProductB02();
    }
}
