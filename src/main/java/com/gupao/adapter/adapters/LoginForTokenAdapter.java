package com.gupao.adapter.adapters;

import com.gupao.adapter.ResultMsg;

/**
 * Created by DJ on 2019年07月31日 20:31
 **/
public class LoginForTokenAdapter implements ILoginAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}
