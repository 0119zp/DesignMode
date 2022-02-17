package com.zpan.design.Builder;

/**
 * 指挥者
 */

public class Director {

    Builder builder = null;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void construct(String name,String old,String address,String num){
        builder.setName(name);
        builder.setOld(old);
        builder.setAddress(address);
        builder.setNum(num);
    }

}
