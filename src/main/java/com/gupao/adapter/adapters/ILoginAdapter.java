package com.gupao.adapter.adapters;

import com.gupao.adapter.ResultMsg;

/**
 * Created by DJ on 2019年07月31日 20:25
 **/
public interface ILoginAdapter {
    boolean support(Object adapter);
    ResultMsg login(String id, Object adapter);
}
