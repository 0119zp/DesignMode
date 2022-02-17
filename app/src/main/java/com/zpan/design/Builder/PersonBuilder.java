package com.zpan.design.Builder;

/**
 * 具体创建类
 */

public class PersonBuilder implements Builder{

    private Person person = new ZpPerson();

    @Override
    public void setName(String name) {
        person.setName(name);
    }

    @Override
    public void setOld(String old) {
        person.setOld(old);
    }

    @Override
    public void setAddress(String address) {
        person.setAddress(address);
    }

    @Override
    public void setNum(String num) {
        person.setNum(num);
    }

    @Override
    public Person creat() {
        return person;
    }
}
