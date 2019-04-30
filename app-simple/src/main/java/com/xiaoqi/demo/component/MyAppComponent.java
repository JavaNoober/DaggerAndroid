package com.xiaoqi.demo.component;

import com.xiaoqi.demo.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {
//        ABModule.class,
//        Main2ActivityModule.class,
})
public interface MyAppComponent {
    void inject(MainActivity activity);
//
//    A getA();
//
//    B getB();
//
//    @Component.Builder
//    interface Builder{
//
//        @BindsInstance
//        Builder a(A a2);
//
//        @BindsInstance
//        Builder b(B b2);
//
//
////        Builder engineModule(ABParamModule abParamModule);
//
//        MyAppComponent build();
//    }
}
