package com.xiaoqi.daggerandroid.component;

import com.xiaoqi.daggerandroid.A;
import com.xiaoqi.daggerandroid.A2;
import com.xiaoqi.daggerandroid.B;
import com.xiaoqi.daggerandroid.B2;
import com.xiaoqi.daggerandroid.MyApplication;
import com.xiaoqi.daggerandroid.UserInfo;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

//@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        MainActivityModule.class,
        Main2ActivityModule.class,
})
public interface MyAppComponent {
    void inject(MyApplication application);

    A getA();

    B getB();

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder a(A a2);

        @BindsInstance
        Builder b(B b2);


//        Builder engineModule(ABParamModule abParamModule);

        MyAppComponent build();
    }
}
