package com.xiaoqi.submoudle;

import javax.inject.Inject;

public class C {
    private A a;

    private B b;

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
