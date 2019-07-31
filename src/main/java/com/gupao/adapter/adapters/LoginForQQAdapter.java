package com.gupao.adapter.adapters;

import com.gupao.adapter.ResultMsg;

/**
 * Created by DJ on 2019年07月31日 20:26
 **/
public class LoginForQQAdapter implements ILoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForQQAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
