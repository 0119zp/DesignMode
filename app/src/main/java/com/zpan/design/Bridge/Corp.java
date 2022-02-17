package com.zpan.design.Bridge;

/**
 * corp -- 抽象类
 */

public abstract class Corp {

    // 定义一个产品对象 -- 抽象的，不知道具体什么产品
    private Product product;

    // 构造函数，由子类传递具体的产品对象进来
    public Corp(Product product){
        this.product = product;
    }

    // 具体的逻辑操作
    public void makeMoney(){
        product.beProducted();
        product.sellProduct();
    }

}
