package com.gupao.adapter.adapters;

import com.gupao.adapter.ResultMsg;

/**
 * Created by DJ on 2019年07月31日 20:27
 **/
public class LoginForWechatAdapter implements ILoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
