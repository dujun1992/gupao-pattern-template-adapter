package com.gupao.template;

import java.util.List;

/**
 * Created by DJ on 2019年07月31日 19:43
 **/
public class Test {
    public static void main(String[] args) {
        MemberDao memberDao = new MemberDao(null);
        List<?> result = memberDao.selectAll();
        System.out.println(result);
    }
}
