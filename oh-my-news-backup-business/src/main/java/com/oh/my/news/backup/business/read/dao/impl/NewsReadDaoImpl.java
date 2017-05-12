package com.oh.my.news.backup.business.read.dao.impl;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.oh.my.news.backup.business.read.dao.NewsReadDao;
import com.oh.news.backup.model.dto.NewsDto;
import com.oh.news.backup.model.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by llf on 2017/5/10.
 */
@Repository
public class NewsReadDaoImpl implements NewsReadDao {
    @Autowired
    @Qualifier(value = "sqlMapClientRead")
    private SqlMapClient sqlMapClient;

    public List<News> queryNews(NewsDto newsDto) throws Exception {
        if(newsDto.getSort()==null) newsDto.setSort(0);
        List<News> list = new ArrayList<News>();
        Map<String,Object> map = new HashMap();
        map.put("userid", newsDto.getUserid());
        map.put("newsname", newsDto.getNewsname());
        map.put("issuetime", newsDto.getIssuetime());
        map.put("status", newsDto.getStatus());
        map.put("pageItemNum", newsDto.getPageItemNum());
        map.put("currentPage", (newsDto.getCurrentPage() - 1) * newsDto.getPageItemNum());
        switch (newsDto.getSort()) {
            case 0:
                list = sqlMapClient.queryForList("news_sqlMap.sortbyId", map);
                break;
            case 1:
                list = sqlMapClient.queryForList("news_sqlMap.sortbydate", map);
                break;
            case 2:
                list = sqlMapClient.queryForList("news_sqlMap.sortbythumbup", map);
                break;
            case 3:
                list = sqlMapClient.queryForList("news_sqlMap.sortbycomment", map);
                break;
            case 4:
                list = sqlMapClient.queryForList("news_sqlMap.sortbyreport", map);
                break;
            case 5:
                list = sqlMapClient.queryForList("news_sqlMap.sortbystatus", map);
                break;
            case 6:
                list = sqlMapClient.queryForList("news_sqlMap.sortbydeadline", map);
                break;
        }
        return list;
    }

    public Integer queryNewsNum(NewsDto newsDto) throws Exception {
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("userid",newsDto.getUserid());
        map.put("newsname",newsDto.getNewsname());
        map.put("status",newsDto.getStatus());
        map.put("issuetime",newsDto.getIssuetime());
        return (Integer)sqlMapClient.queryForObject("news_sqlMap.sortbyIdNum",map);
    }
}
