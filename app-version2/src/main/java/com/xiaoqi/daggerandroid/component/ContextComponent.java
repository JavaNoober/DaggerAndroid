package com.xiaoqi.daggerandroid.component;


import android.content.Context;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

@Component(modules = {
        ABModule.class
})
public interface ContextComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder context(Context context);
        ContextComponent build();
    }
}
