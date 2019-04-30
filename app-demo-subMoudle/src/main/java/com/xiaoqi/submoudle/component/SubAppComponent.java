package com.xiaoqi.submoudle.component;

import android.content.Context;

import com.xiaoqi.submoudle.MyApplication;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        SubMoudleActivityModule.class
})
public interface SubAppComponent {


    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        SubAppComponent build();
    }


    void inject(MyApplication application);
}
