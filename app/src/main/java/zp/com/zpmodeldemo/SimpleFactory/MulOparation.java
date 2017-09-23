package zp.com.zpmodeldemo.SimpleFactory;

/**
 * 乘法
 */

public class MulOparation extends Operation{
    @Override
    public double getResult() {
        return numA * numB;
    }
}
