package zp.com.zpmodeldemo.Adapter;

/**
 * 目标角色
 */

public interface Target {

    // 这是源类Adaptee也有的方法
    void sampleOperationA();
    // 这是源类Adaptee没有的方法
    void sampleOperationB();

}
