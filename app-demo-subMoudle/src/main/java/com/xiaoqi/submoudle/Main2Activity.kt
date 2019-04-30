package com.xiaoqi.submoudle

import android.os.Bundle
import com.xiaoqi.demo.DaggerMvpActivity
import com.xiaoqi.demo.R
import com.xiaoqi.submoudle.presenter.MainPresenter
import com.xiaoqi.submoudle.view.MainView
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
