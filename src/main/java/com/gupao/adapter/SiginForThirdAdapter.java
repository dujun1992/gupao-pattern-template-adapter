package com.gupao.adapter;

import com.gupao.adapter.adapters.ILoginAdapter;
import com.gupao.adapter.adapters.LoginForQQAdapter;
import com.gupao.adapter.adapters.LoginForTokenAdapter;
import com.gupao.adapter.adapters.LoginForWechatAdapter;

/**
 * Created by DJ on 2019年07月31日 20:21
 **/
public class SiginForThirdAdapter extends SiginService implements IForThird {

    @Override
    public ResultMsg loginForQQ(String id) {
        return processLogin(id,LoginForQQAdapter.class);
    }

    @Override
    public ResultMsg loginForWechat(String id) {
        return processLogin(id,LoginForWechatAdapter.class);
    }

    @Override
    public ResultMsg loginForToken(String token) {
        return processLogin(token,LoginForTokenAdapter.class);
    }


    private ResultMsg processLogin(String key,Class<? extends ILoginAdapter> clazz){
        try{
            //适配器不一定要实现接口
            ILoginAdapter adapter = clazz.newInstance();

            //判断传过来的适配器是否能处理指定的逻辑
            if(adapter.support(adapter)){
                return adapter.login(key,adapter);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
