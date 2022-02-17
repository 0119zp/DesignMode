package com.zpan.design.Observer;

import android.util.Log;

import java.util.Observable;

/**
 * 被观察者
 */

public class HanFeiZi extends Observable{

    public void fun(){
        Log.e("zhang","==韩非子开始玩耍=");
        super.setChanged();
        super.notifyObservers("韩非子在玩耍。。");
    }

    public void cry(){
        Log.e("zhang","==韩非子开始哭了==");
        super.setChanged();
        super.notifyObservers("韩非子在哭。。");
    }



}
