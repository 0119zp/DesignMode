package com.zpan.design.Observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者01
 */

public class LiSi implements Observer {

    @Override
    public void update(Observable observable, Object o) {
        tellBoss(o.toString());
    }

    public void tellBoss(String str){
        Log.e("zhang","==李斯说：老板韩非==" + str);
    }


}
