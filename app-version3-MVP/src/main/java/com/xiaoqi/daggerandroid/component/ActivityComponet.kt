package com.xiaoqi.daggerandroid.component

import com.xiaoqi.daggerandroid.DaggerMvpActivity
import com.xiaoqi.daggerandroid.presenter.BasePresenter
import com.xiaoqi.daggerandroid.view.IBaseView
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Subcomponent(modules = [AndroidInjectionModule::class])
interface ActivityComponet: AndroidInjector<DaggerMvpActivity<BasePresenter<IBaseView>, IBaseView>>{

    //每一个继承BaseActivity的Activity，都共享同一个SubComponent
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<DaggerMvpActivity<BasePresenter<IBaseView>, IBaseView>>()
}