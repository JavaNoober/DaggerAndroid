package com.xiaoqi.daggerandroid.component;

import com.xiaoqi.daggerandroid.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;

@Subcomponent(modules = {
        AndroidInjectionModule.class,
})
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {


    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }
}
