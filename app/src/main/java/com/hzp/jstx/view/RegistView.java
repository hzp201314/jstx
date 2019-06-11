package com.hzp.jstx.view;

/**
 * Created by fullcircle on 2016/12/31.
 */

public interface RegistView {
    void onGetRegistState(String username, String pwd, boolean isSuccess, String errorMsg);
}
