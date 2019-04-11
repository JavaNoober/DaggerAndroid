package com.xiaoqi.daggerandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.xiaoqi.daggerandroid.component.ABModule;
import com.xiaoqi.daggerandroid.component.DaggerAComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MainActivity extends BaseActivity {

    @Inject
    A2 a2;

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
//        DaggerAComponent.builder().aBModule(new ABModule(new A2(), new B2())).build().inject(this);
        a2.someThingA();
    }
}
