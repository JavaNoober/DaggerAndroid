package com.xiaoqi.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.xiaoqi.submoudle.A2;
import com.xiaoqi.submoudle.SubMainActivity;
import com.xiaoqi.submoudle.presenter.MainPresenter;
import com.xiaoqi.submoudle.view.MainView;

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
                startActivity(new Intent(MainActivity.this, SubMainActivity.class));
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
