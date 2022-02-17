package com.zpan.design.Propotype;

/**
 * 学生类
 */

public class Student implements Cloneable{

    private String name;
    private String old;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    // 返回克隆对象
    public Student clone(){
        Student student = null;

        try {
            student = (Student) super.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return student;
    }

}
