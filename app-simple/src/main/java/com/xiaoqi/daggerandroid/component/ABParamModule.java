package com.xiaoqi.daggerandroid.component;


import com.xiaoqi.daggerandroid.A;
import com.xiaoqi.daggerandroid.B;
import com.xiaoqi.daggerandroid.C;

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
