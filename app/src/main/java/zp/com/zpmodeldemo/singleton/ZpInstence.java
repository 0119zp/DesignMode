package zp.com.zpmodeldemo.singleton;


/**
 * 单例模式
 *
 */

public class ZpInstence {

    /**
     * 懒汉模式 -- 非线程安全，采用以下方式优化
     */

//    // 私有化构造函数
//    private ZpInstence(){}
//
//    // 3、静态内部类
//    // -- 实现了线程安全，又避免了同步带来的性能影响
//    private static class Holder {
//        private static final ZpInstence zpInstence = new ZpInstence();
//    }
//    public static ZpInstence getInstance() {
//        return Holder.zpInstence;
//    }


    /**
     * 饿汉模式 -- 天生的线程安全
     */

    private ZpInstence(){}

    // 创建好一个静态的对象供系统调用
    private static final ZpInstence zpInstence = new ZpInstence();

    public static ZpInstence getInstance() {
        return zpInstence;
    }



}
