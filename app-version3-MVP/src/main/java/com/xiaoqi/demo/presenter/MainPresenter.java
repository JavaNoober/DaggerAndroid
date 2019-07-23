package com.xiaoqi.demo.presenter;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

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

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        Log.e("MainPresenter", "onResume");
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        Log.e("MainPresenter", "onPause");
    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        super.onDestroy(owner);
        Log.e("MainPresenter", "onDestroy");
    }
}
