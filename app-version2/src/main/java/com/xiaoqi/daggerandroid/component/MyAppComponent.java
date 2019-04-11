package com.xiaoqi.daggerandroid.component;

import com.xiaoqi.daggerandroid.MyApplication;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        ActivityModule.class
})
public interface MyAppComponent {
    void inject(MyApplication application);
}
