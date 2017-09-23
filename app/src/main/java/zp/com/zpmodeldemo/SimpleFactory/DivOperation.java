package zp.com.zpmodeldemo.SimpleFactory;

/**
 * 除法
 */

public class DivOperation extends Operation{
    @Override
    public double getResult() {
        return numA / numB;
    }
}
