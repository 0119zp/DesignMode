package com.zpan.design.Builder;

/**
 * 个人信息
 */

public abstract class Person {

    protected String name;
    protected String old;
    protected String address;
    protected String num;

    public abstract void setName(String name);

    public abstract void setOld(String old);

    public abstract void setAddress(String address);

    public abstract void setNum(String num);
}
