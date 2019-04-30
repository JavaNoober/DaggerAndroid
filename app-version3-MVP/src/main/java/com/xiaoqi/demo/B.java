package com.xiaoqi.demo;

import android.util.Log;

import javax.inject.Inject;

public class B {

    @Inject
    public B(){

    }

    public void someThingB(){
        Log.e("DAGGER", "someThingB");
    }
}
