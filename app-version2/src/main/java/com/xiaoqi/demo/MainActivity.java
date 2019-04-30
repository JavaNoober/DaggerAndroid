package com.xiaoqi.demo;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import javax.inject.Inject;


public class MainActivity extends BaseActivity {

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
//        DaggerAComponent.builder().aBModule(new ABModule(new A2(), new B2())).build().inject(this);
        a2.someThingA();
        sp.toString();
    }
}
