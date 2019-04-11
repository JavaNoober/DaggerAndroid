package com.xiaoqi.daggerandroid.component

import android.app.Activity
import com.xiaoqi.daggerandroid.BaseActivity
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Subcomponent(modules = [AndroidInjectionModule::class])
interface ActivityComponet: AndroidInjector<BaseActivity>{

    //每一个继承BaseActivity的Activity，都共享同一个SubComponent
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<BaseActivity>()
}