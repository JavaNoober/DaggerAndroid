package com.xiaoqi.demo.presenter;

import androidx.annotation.NonNull;
import androidx.lifecycle.LifecycleOwner;

import com.xiaoqi.demo.view.IBaseView;

public class BasePresenter<T extends IBaseView> implements IBasePresenter {

    private T view;


    public T getView() {
        return view;
    }

    public void attachView(T view){
        this.view = view;
    }

    /**
     * Notifies that {@code ON_CREATE} event occurred.
     * <p>
     * This method will be called after the {@link LifecycleOwner}'s {@code onCreate}
     * method returns.
     *
     * @param owner the component, whose state was changed
     */
    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
    }

    /**
     * Notifies that {@code ON_START} event occurred.
     * <p>
     * This method will be called after the {@link LifecycleOwner}'s {@code onStart} method returns.
     *
     * @param owner the component, whose state was changed
     */
    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
    }

    /**
     * Notifies that {@code ON_RESUME} event occurred.
     * <p>
     * This method will be called after the {@link LifecycleOwner}'s {@code onResume}
     * method returns.
     *
     * @param owner the component, whose state was changed
     */
    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
    }

    /**
     * Notifies that {@code ON_PAUSE} event occurred.
     * <p>
     * This method will be called before the {@link LifecycleOwner}'s {@code onPause} method
     * is called.
     *
     * @param owner the component, whose state was changed
     */
    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
    }

    /**
     * Notifies that {@code ON_STOP} event occurred.
     * <p>
     * This method will be called before the {@link LifecycleOwner}'s {@code onStop} method
     * is called.
     *
     * @param owner the component, whose state was changed
     */
    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
    }

    /**
     * Notifies that {@code ON_DESTROY} event occurred.
     * <p>
     * This method will be called before the {@link LifecycleOwner}'s {@code onDestroy} method
     * is called.
     *
     * @param owner the component, whose state was changed
     */
    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
    }


}
