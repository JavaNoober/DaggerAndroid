package com.xiaoqi.daggerandroid

import android.os.Bundle
import com.xiaoqi.daggerandroid.presenter.MainPresenter
import com.xiaoqi.daggerandroid.view.MainView
import javax.inject.Inject

class Main2Activity : DaggerMvpActivity<MainPresenter, MainView>(), MainView {
    override fun showToast() {

    }

    @Inject lateinit var a2: A2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        a2.someThingA()
    }
}
