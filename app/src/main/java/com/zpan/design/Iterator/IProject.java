package com.zpan.design.Iterator;

/**
 * 项目管理抽象类
 */

public interface IProject {

    // 增加项目
    public void addProject(String name,String money);
    // 得到项目信息
    public String getProjectInfo();

    // 获得一个可以被遍历的对象
    public IProjectIterator iterator();

}
