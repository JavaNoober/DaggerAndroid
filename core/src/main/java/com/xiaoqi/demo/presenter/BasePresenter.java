package com.xiaoqi.demo.presenter;

import com.xiaoqi.demo.view.IBaseView;

public class BasePresenter<T extends IBaseView> {

    private T view;


    public T getView() {
        return view;
    }

    public void attachView(T view){
        this.view = view;
    }
}
