package com.zpan.design.Observer;

import android.util.Log;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/3/9 0009.
 */

public class LiuSi implements Observer{

    @Override
    public void update(Observable observable, Object o) {
        tellBoss(o.toString());
    }

    public void tellBoss(String str){
        Log.e("zhang","== 柳丝说：韩非子在 ==" + str);
    }
}
