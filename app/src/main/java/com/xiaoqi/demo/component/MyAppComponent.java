package com.xiaoqi.demo.component;

import com.xiaoqi.demo.MyApplication;

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

//    A getA();
//
//    B getB();

    @Component.Builder
    interface Builder{

//        @BindsInstance
//        Builder a(A a2);
//
//        @BindsInstance
//        Builder b(B b2);


//        Builder engineModule(ABParamModule abParamModule);

        MyAppComponent build();
    }
}
