package com.xiaoqi.demo.component;

import android.content.Context;

import com.xiaoqi.demo.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        ActivityModule.class
})
public interface MyAppComponent {


    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        MyAppComponent build();
    }


    void inject(MyApplication application);
}
