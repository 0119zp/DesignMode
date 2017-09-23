package zp.com.zpmodeldemo.Decorator;

/**
 * 最核心类
 * --成绩单的抽象类
 */

public abstract class SchoolReport {

    // 成绩单
    public abstract void report();
    // 家长签名
    public abstract void sign(String name);

}
