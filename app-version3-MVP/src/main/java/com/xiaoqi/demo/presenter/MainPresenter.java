package com.xiaoqi.demo.presenter;

import android.util.Log;

import com.xiaoqi.demo.view.MainView;

import javax.inject.Inject;

public class MainPresenter extends BasePresenter<MainView> {

    @Inject
    public MainPresenter(){

    }


    public void doPresenter(){
        Log.e("MainPresenter", "doPresenter");
        getView().showToast();
    }
}
