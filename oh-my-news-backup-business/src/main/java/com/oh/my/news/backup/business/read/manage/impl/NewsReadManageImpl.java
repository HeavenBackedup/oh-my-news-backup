package com.oh.my.news.backup.business.read.manage.impl;

import com.oh.my.news.backup.business.read.dao.NewsReadDao;
import com.oh.my.news.backup.business.read.manage.NewsReadManage;
import com.oh.news.backup.model.dto.NewsDto;
import com.oh.news.backup.model.po.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by llf on 2017/5/10.
 */
@Service
public class NewsReadManageImpl implements NewsReadManage {
    @Autowired
    private NewsReadDao newsReadDao;
    public List<News> query(NewsDto newsDto) throws Exception {
        return newsReadDao.queryNews(newsDto);
    }

    public Integer queryNum(NewsDto newsDto) throws Exception {
        return newsReadDao.queryNewsNum(newsDto);
    }
}
