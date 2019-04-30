package com.xiaoqi.demo;

import android.util.Log;

import javax.inject.Inject;

public class B2 {

    @Inject
    public B2(){

    }

    public void someThingB(){
        Log.e("DAGGER", "someThingB2");
    }
}
