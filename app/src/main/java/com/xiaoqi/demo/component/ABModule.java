package com.xiaoqi.demo.component;


import com.xiaoqi.demo.A2;
import com.xiaoqi.demo.B2;

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
