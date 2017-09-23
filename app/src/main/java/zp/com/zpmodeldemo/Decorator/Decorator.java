package zp.com.zpmodeldemo.Decorator;

/**
 * 装饰类，把成绩单装饰一下
 * 作用 -- 让子类封装
 */

public abstract class Decorator extends SchoolReport{

    // 首先要知道是哪个成绩单
    private SchoolReport sr;

    // 通过构造函数把成绩单传过来
    public Decorator(SchoolReport sr){
        this.sr = sr;
    }

    // 成绩单还是要被看到
    @Override
    public void report() {
        this.sr.report();
    }

    // 签名还是要的
    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
