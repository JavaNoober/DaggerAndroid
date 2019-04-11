package com.xiaoqi.daggerandroid.component

import com.xiaoqi.daggerandroid.Main2Activity
import dagger.Binds
import dagger.Module
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap

@Module(subcomponents = [Main2ActivitySubcomponent::class])
abstract class Main2ActivityModule{
    @Binds
    @IntoMap
    @ClassKey(Main2Activity::class)
    internal abstract fun bindMainActivityInjectorFactory(builder: Main2ActivitySubcomponent.Builder): AndroidInjector.Factory<*>
}