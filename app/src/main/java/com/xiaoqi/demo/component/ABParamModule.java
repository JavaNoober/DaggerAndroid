package com.xiaoqi.demo.component;


import com.xiaoqi.demo.A;
import com.xiaoqi.demo.B;
import com.xiaoqi.demo.C;

import dagger.Module;
import dagger.Provides;

@Module
public class ABParamModule {
    A a;
    B b;

    public ABParamModule(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Provides
    public A provideA2() {
        return a;
    }

    @Provides
    public B provideB2() {
        return b;
    }

    @Provides
    public C provideC() {
        return new C(a,b);
    }
}
