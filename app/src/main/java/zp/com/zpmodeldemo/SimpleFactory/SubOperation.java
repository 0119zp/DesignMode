package zp.com.zpmodeldemo.SimpleFactory;

/**
 * 减法
 */

public class SubOperation extends Operation{
    @Override
    public double getResult() {
        return numA - numB;
    }
}
