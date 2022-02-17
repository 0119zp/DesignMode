package com.zpan.design.Composite;

import java.util.ArrayList;

import com.zpan.design.LogUtils;

/**
 * 具体实现
 */

public class ConcreteCompany extends Company{

    private ArrayList<Company> list = new ArrayList<>();

    public ConcreteCompany(String name){
        super(name);
    }

    @Override
    public void add(Company company) {
        list.add(company);
    }

    @Override
    public void remove(Company company) {
        list.remove(company);
    }

    @Override
    public void display(int position) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }

        LogUtils.getELog(new String(sb) + this.getName());

        for (Company c : list) {
            c.display(position + 1);
        }

    }
}
