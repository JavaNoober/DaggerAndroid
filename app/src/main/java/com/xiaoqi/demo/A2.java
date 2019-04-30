package com.xiaoqi.demo;

import android.util.Log;

import javax.inject.Inject;

public class A2 {

    @Inject
    public A2(){

    }

    public void someThingA(){
        Log.e("DAGGER", "someThingA2");
    }
}
