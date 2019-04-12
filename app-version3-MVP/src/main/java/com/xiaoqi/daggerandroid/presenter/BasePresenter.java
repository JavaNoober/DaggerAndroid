package com.xiaoqi.daggerandroid.presenter;

import com.xiaoqi.daggerandroid.view.IBaseView;

public class BasePresenter<T extends IBaseView> {

    private T view;


    public T getView() {
        return view;
    }

    public void attachView(T view){
        this.view = view;
    }
}
