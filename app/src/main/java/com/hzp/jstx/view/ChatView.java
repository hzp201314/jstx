package com.hzp.jstx.view;

import com.hyphenate.chat.EMMessage;

import java.util.List;

/**
 * Created by fullcircle on 2017/1/6.
 */

public interface ChatView {
    void getHistoryMessage(List<EMMessage> emMessages);

    void updateList();
}
