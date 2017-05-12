package com.oh.my.news.backup.business.write.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.oh.my.news.backup.business.write.dao.UserWriteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/5/8.
 */
@Repository
public class UserWriteDaoImpl implements UserWriteDao {
    @Autowired
    @Qualifier(value = "sqlMapClientWrite")
    private SqlMapClient sqlMapClient;
    public void updateUser(Integer userid,Integer status, Date deadline) throws Exception {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("userid",userid);
        map.put("status",status);
        map.put("deadline",deadline);
        sqlMapClient.update("user_sqlMap.update_user",map);
    }
}
