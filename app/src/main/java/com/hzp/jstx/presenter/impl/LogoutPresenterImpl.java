package com.hzp.jstx.presenter.impl;

import com.hyphenate.EMCallBack;
import com.hyphenate.chat.EMClient;
import com.hzp.jstx.callback.MyEmCalBack;
import com.hzp.jstx.presenter.LogoutPresenter;
import com.hzp.jstx.view.PluginView;


/**
 * Created by fullcircle on 2017/1/3.
 */

public class LogoutPresenterImpl implements LogoutPresenter {
    private PluginView pluginView;

    public LogoutPresenterImpl(PluginView pluginView) {
        this.pluginView = pluginView;
    }

    @Override
    public void logout() {
        EMClient.getInstance().logout(true, new MyEmCalBack() {
            @Override
            public void success() {
                pluginView.onLogout(true,null);
            }

            @Override
            public void error(int i, String s) {
                pluginView.onLogout(false,s);
            }
        });
    }
}
