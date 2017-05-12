package com.oh.my.news.backup.business.write.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.oh.my.news.backup.business.write.dao.NewsWriteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by llf on 2017/5/10.
 */
@Repository
public class NewsWriteDaoImpl implements NewsWriteDao {
    @Autowired
    @Qualifier(value = "sqlMapClientWrite")
    private SqlMapClient sqlMapClient;
    public void updateNews(Integer newsid, Integer status, Date deadline) throws Exception {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("newsid",newsid);
        map.put("status",status);
        map.put("deadline",deadline);
        sqlMapClient.update("news_sqlMap.update_news",map);
    }
}
