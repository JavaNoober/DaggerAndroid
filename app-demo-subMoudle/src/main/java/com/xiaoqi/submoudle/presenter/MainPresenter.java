package com.xiaoqi.submoudle.presenter;

import android.util.Log;

import com.xiaoqi.demo.presenter.BasePresenter;
import com.xiaoqi.submoudle.view.MainView;

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
