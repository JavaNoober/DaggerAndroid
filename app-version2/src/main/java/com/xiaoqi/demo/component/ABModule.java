package com.xiaoqi.demo.component;


import android.content.Context;
import android.content.SharedPreferences;

import com.xiaoqi.demo.A2;
import com.xiaoqi.demo.B2;

import dagger.Module;
import dagger.Provides;

@Module
public class ABModule {
    A2 a2;

    B2 b2;

    public ABModule() {
    }


    public ABModule(A2 a2, B2 b2) {
        this.a2 = a2;
        this.b2 = b2;
    }

    @Provides
    public A2 provideA2() {
        return new A2();
    }

    @Provides
    public B2 provideB2() {
        return new B2();
    }


    @Provides
    SharedPreferences provideSp(Context context) {
        return context.getSharedPreferences("def", Context.MODE_PRIVATE);
    }
}
