package zp.com.zpmodeldemo.Builder;

/**
 * 具体人类
 */

public class ZpPerson extends Person{

    @Override
    public void setName(String name1) {
        name = name1;
    }

    @Override
    public void setOld(String old1) {
        old = old1;
    }

    @Override
    public void setAddress(String address1) {
        address = address1;
    }

    @Override
    public void setNum(String num1) {
        num = num1;
    }

    @Override
    public String toString() {
        return "name = " + name + "; old = " + old + "; address = " + address + "; num = " + num;
    }
}
