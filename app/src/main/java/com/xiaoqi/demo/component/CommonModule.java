package com.xiaoqi.demo.component;

import com.xiaoqi.demo.UserInfo;

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
