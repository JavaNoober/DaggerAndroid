package com.xiaoqi.daggerandroid.component

import com.xiaoqi.daggerandroid.Main2Activity
import com.xiaoqi.daggerandroid.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module(subcomponents = [ActivityComponet::class])
abstract class ActivityModule{
    @ContributesAndroidInjector(modules = [ABModule::class])
    abstract fun mainActivityInjector(): MainActivity

    @ContributesAndroidInjector(modules = [ABModule::class])
    abstract fun main2ActivityInjector(): Main2Activity
}