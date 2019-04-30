package com.xiaoqi.demo.component

import com.xiaoqi.demo.Main2Activity
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector


@Subcomponent(modules = [AndroidInjectionModule::class])//        ABModule.class

interface Main2ActivitySubcomponent: AndroidInjector<Main2Activity> {
    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<Main2Activity>()
}