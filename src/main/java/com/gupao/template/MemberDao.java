package com.gupao.template;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by DJ on 2019年07月31日 19:29
 **/
public class MemberDao extends  JdbcTemplate {
    public MemberDao(DataSource dataSource) {
        super(dataSource);
    }

    public List<?> selectAll(){
        String sql ="select * from tbl_member";
        return super.executeQuery(sql,(rs,rowNum)->{
            Member member = new Member();
            member.setUsername(rs.getString("username"));
            member.setPassword(rs.getString("password"));
            member.setAge(rs.getInt("age"));
            return member;
        },null);
    }
}
