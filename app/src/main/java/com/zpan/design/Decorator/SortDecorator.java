package com.zpan.design.Decorator;

import android.util.Log;

/**
 * 子类 -- 装饰最高排名
 */

public class SortDecorator extends Decorator{

    public SortDecorator(SchoolReport sr) {
        super(sr);
    }

    public void reportSort(){
        Log.e("zhang","学校排名 == 4");
    }

    @Override
    public void report() {
        super.report();
        this.reportSort();
    }
}
