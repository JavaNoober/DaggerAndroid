package com.xiaoqi.demo;

import com.xiaoqi.submoudle.A;
import com.xiaoqi.submoudle.B;

import javax.inject.Inject;

public class C {
    private com.xiaoqi.submoudle.A a;

    private com.xiaoqi.submoudle.B b;

    @Inject
    public C(A a, B b) {
        this.a = a;
        this.b = b;
    }


    public void doSomethingC(){
        a.someThingA();
        b.someThingB();
    }
}
