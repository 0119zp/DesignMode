package zp.com.zpmodeldemo.SimpleFactory;

/**
 * 加法
 */

public class AddOperation extends Operation{
    @Override
    public double getResult() {

        return numA + numB;
    }
}
