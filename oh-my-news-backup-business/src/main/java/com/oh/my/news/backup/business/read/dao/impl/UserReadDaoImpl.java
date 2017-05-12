package com.oh.my.news.backup.business.read.dao.impl;


import com.ibatis.sqlmap.client.SqlMapClient;
import com.oh.my.news.backup.business.read.dao.UserReadDao;
import com.oh.news.backup.model.dto.UserDto;
import com.oh.news.backup.model.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/8.
 */
@Repository
public class UserReadDaoImpl implements UserReadDao {
    @Autowired
    @Qualifier(value = "sqlMapClientRead")
    private SqlMapClient sqlMapClient;

    public List<User> queryUser(UserDto userDto) throws Exception {
        if(userDto.getSort()==null) userDto.setSort(0);
        List<User> list = new ArrayList<User>();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", userDto.getUserid());
        map.put("username", userDto.getUsername());
        map.put("status", userDto.getStatus());
        map.put("registertime", userDto.getRegistertime());
        map.put("currentPage", (userDto.getCurrentPage()-1)*userDto.getPageItemNum());
        map.put("pageItemNum", userDto.getPageItemNum());//每页显示的条目数
        switch (userDto.getSort()) {
            case 0:
                list = sqlMapClient.queryForList("user_sqlMap.sortbyId", map);
                break;
            case 1:
                list = sqlMapClient.queryForList("user_sqlMap.sortbyRegistertime", map);
                break;
            case 2:
                list = sqlMapClient.queryForList("user_sqlMap.sortbyReport", map);
                break;
            case 3:
                list = sqlMapClient.queryForList("user_sqlMap.sortbyStatus", map);
                break;
            case 4:
                list = sqlMapClient.queryForList("user_sqlMap.sortbyDeadline", map);
                break;
        }
        return list;
    }

    public Integer queryUserNum(UserDto userDto) throws Exception {
        int pageNum=-1;
        if(userDto.getSort()==null) userDto.setSort(0);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("userid", userDto.getUserid());
        map.put("username", userDto.getUsername());
        map.put("status", userDto.getStatus());
        map.put("registertime", userDto.getRegistertime());
       pageNum=(Integer) sqlMapClient.queryForObject("user_sqlMap.sortbyIdNum",map);
       return pageNum;
    }

}
