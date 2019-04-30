package com.xiaoqi.demo

import android.os.Bundle
import android.util.Log
import javax.inject.Inject

class Main2Activity : BaseActivity() {

    @Inject lateinit var a2: A2

    @Inject lateinit var c: C


    @Inject lateinit var userInfo: UserInfo

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        a2.someThingA()
        c.doSomethingC()
        Log.e("DAGGER", userInfo.toString())
//        DaggerAComponent.builder().aBModule(ABModule(A2(), B2())).build().inject(this)
    }
}
