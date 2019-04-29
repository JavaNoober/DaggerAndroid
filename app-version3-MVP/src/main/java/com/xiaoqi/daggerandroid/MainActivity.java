package com.xiaoqi.daggerandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xiaoqi.daggerandroid.presenter.MainPresenter;
import com.xiaoqi.daggerandroid.view.MainView;

import javax.inject.Inject;


public class MainActivity extends DaggerMvpActivity<MainPresenter, MainView> implements MainView {

    @Inject
    A2 a2;

    @Inject
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
        a2.someThingA();
        sp.toString();
        presenter.doPresenter();
    }

    @Override
    public void showToast() {
        Log.e("MainActivity", "showToast");
    }
}
