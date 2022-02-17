package com.zpan.design.Builder;

/**
 * 创建者接口
 */

public interface Builder {

    abstract void setName(String name);
    abstract void setOld(String old);
    abstract void setAddress(String address);
    abstract void setNum(String num);

    abstract Person creat();

}
