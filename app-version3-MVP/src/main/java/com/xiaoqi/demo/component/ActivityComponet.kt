package com.xiaoqi.demo.component

import com.xiaoqi.demo.DaggerMvpActivity
import com.xiaoqi.demo.presenter.BasePresenter
import com.xiaoqi.demo.view.IBaseView
import dagger.Subcomponent
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector

@Subcomponent(modules = [AndroidInjectionModule::class])
interface ActivityComponet: AndroidInjector<DaggerMvpActivity<BasePresenter<IBaseView>, IBaseView>>{

    //每一个继承BaseActivity的Activity，都共享同一个SubComponent
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<DaggerMvpActivity<BasePresenter<IBaseView>, IBaseView>>()
}