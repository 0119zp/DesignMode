package zp.com.zpmodeldemo.Composite;

import zp.com.zpmodeldemo.LogUtils;

/**
 * Created by Administrator on 2017/4/1 0001.
 */

public class FinanceDepartment extends Company{

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {

    }

    @Override
    public void remove(Company company) {

    }

    @Override
    public void display(int position) {

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < position; i++) {
            sb.append("-");
        }
        LogUtils.getELog(new String(sb) + this.getName());

    }
}
