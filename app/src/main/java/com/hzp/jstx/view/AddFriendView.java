package com.hzp.jstx.view;

import com.hzp.jstx.model.User;

import java.util.List;

/**
 * Created by fullcircle on 2017/1/4.
 */

public interface AddFriendView {

    void onQuerySuccess(List<User> list, List<String> users, boolean b, String errorMeg);

    void onGetAddFriendResult(boolean b, String message);
}
