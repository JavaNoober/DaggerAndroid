package com.xiaoqi.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


import com.xiaoqi.demo.component.DaggerMyAppComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    A a;

    @Inject
    C c;


    @Inject
    UserInfo userInfo;


    @Inject
    UserInfo userInfo2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DaggerMyAppComponent.builder().build().inject(this);
        a.someThingA();
        c.doSomethingC();
        userInfo.setAge("111");
        Log.e("DAGGER", userInfo.toString());
        Log.e("DAGGER", userInfo2.toString());
    }
}
