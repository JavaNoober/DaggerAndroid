package com.xiaoqi.daggerandroid.component;


import com.xiaoqi.daggerandroid.A2;
import com.xiaoqi.daggerandroid.B2;

import javax.inject.Inject;

import dagger.Module;
import dagger.Provides;

@Module(subcomponents = {MainActivitySubcomponent.class, Main2ActivitySubcomponent.class})
public class ABParamModule {
    A2 a2;
    B2 b2;

    @Inject
    public ABParamModule(A2 a2, B2 b2) {
        this.a2 = a2;
        this.b2 = b2;
    }

    @Provides
    public A2 provideA2() {
        return a2;
    }

    @Provides
    public B2 provideB2() {
        return b2;
    }
}
