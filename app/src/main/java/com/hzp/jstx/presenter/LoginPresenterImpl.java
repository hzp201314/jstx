package com.hzp.jstx.presenter;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hzp.jstx.utils.ThreadUtils;
import com.hzp.jstx.view.LoginView;


/**
 * Created by fullcircle on 2016/12/31.
 */

public class LoginPresenterImpl implements LoginPresenter {
    private LoginView loginView;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void login(final String username, String pwd) {
        EMClient.getInstance().login(username, pwd, new EMCallBack() {
            @Override
            public void onSuccess() {
                ThreadUtils.runOnMainThread( new Runnable() {
                    @Override
                    public void run() {
                        loginView.onGetLoginState(username,true,null);
                    }
                });

            }

            @Override
            public void onError(int i, final String s) {
                ThreadUtils.runOnMainThread(new Runnable() {
                    @Override
                    public void run() {
                        loginView.onGetLoginState(username,false,s);
                    }
                });

            }

            @Override
            public void onProgress(int i, String s) {

            }
        });
    }
}
