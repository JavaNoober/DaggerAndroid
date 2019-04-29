package com.xiaoqi.daggerandroid;

import android.app.Activity;
import android.app.Application;

import com.xiaoqi.daggerandroid.component.DaggerMyAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;

public class MyApplication extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();
//        DaggerMyAppComponent.builder().a(new A()).b(new B()).build().inject(this);
        DaggerMyAppComponent.builder().build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
