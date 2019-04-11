package com.xiaoqi.daggerandroid.component;


import com.xiaoqi.daggerandroid.A2;
import com.xiaoqi.daggerandroid.B2;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module
public class ABModule {
    @Provides
    public A2 provideA2() {
        return new A2();
    }

    @Provides
    public B2 provideB2() {
        return new B2();
    }
}
