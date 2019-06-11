package com.hzp.jstx.presenter;

import com.hyphenate.chat.EMClient;
import com.hzp.jstx.view.SplashView;


/**
 * Created by fullcircle on 2016/12/31.
 */

public class SplashPresenterImpl implements SplashPresenter {
    private SplashView splashView;

    public SplashPresenterImpl(SplashView splashView) {
        this.splashView = splashView;
    }

    @Override
    public void checkLogin() {
        //检测是登录过
       if(EMClient.getInstance().isLoggedInBefore()){
           if(EMClient.getInstance().isConnected()){
               //isLoggedInBefore 之前登陆过    isConnected 已经跟环信的服务器建立了连接
               splashView.onGetLoginState(true);
           }

       }else{
           splashView.onGetLoginState(false);
       }
        //splashView.onGetLoginState();
    }
}
