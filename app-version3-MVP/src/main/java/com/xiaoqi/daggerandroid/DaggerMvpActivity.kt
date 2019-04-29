package com.xiaoqi.daggerandroid

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.xiaoqi.daggerandroid.presenter.BasePresenter
import com.xiaoqi.daggerandroid.view.IBaseView
import dagger.android.AndroidInjection
import javax.inject.Inject

open class DaggerMvpActivity<T: BasePresenter<K>, K: IBaseView>: AppCompatActivity(), IBaseView {


    @Inject lateinit var presenter: T

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        presenter.attachView(this as K)
    }
}