package com.gupao.template;

import java.sql.ResultSet;

/**
 * Created by DJ on 2019年07月31日 19:11
 **/
public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
