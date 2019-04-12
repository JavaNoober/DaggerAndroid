package com.xiaoqi.daggerandroid.component;

import com.xiaoqi.daggerandroid.UserInfo;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {


//    UserInfo userInfo;


//    public CommonModule(UserInfo userInfo){
//        this.userInfo = userInfo;
//    }


//    @Singleton
    @Provides
    UserInfo provideUserInfo(){
        return new UserInfo();
    }

}
