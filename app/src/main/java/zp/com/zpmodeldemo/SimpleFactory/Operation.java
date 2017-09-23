package zp.com.zpmodeldemo.SimpleFactory;

/**
 * 从设计模式的类型上来说，简单工厂模式是属于创建型模式，又叫做静态工厂方法（Static Factory Method）模式，
 * 简单工厂模式是由一个工厂对象决定创建出哪一种产品类的实例。
 */

public abstract class Operation {

    public abstract double getResult();

    protected double numA;
    protected double numB;

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }
}
