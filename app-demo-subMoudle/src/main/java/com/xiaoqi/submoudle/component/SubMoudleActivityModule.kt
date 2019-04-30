package com.xiaoqi.submoudle.component

import com.xiaoqi.demo.component.ActivityComponet
import com.xiaoqi.submoudle.Main2Activity
import com.xiaoqi.submoudle.SubMainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector



@Module(subcomponents = [ActivityComponet::class])
abstract class SubMoudleActivityModule{
    @ContributesAndroidInjector(modules = [ABModule::class])
    abstract fun mainActivityInjector(): SubMainActivity

    @ContributesAndroidInjector(modules = [ABModule::class])
    abstract fun main2ActivityInjector(): Main2Activity
}