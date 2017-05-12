package com.oh.my.news.backup.business.write.manage.impl;

import com.oh.my.news.backup.business.write.dao.NewsWriteDao;
import com.oh.my.news.backup.business.write.manage.NewsWriteManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by llf on 2017/5/10.
 */
@Service
public class NewsWriteManageImpl implements NewsWriteManage {
    @Autowired
    private NewsWriteDao newsWriteDao;
    public boolean update(Integer newsid, Integer status, Date deadline) throws Exception {
        newsWriteDao.updateNews(newsid,status,deadline);
        return true;
    }

    public void update1(Integer newsid, Integer status, Date deadline) throws Exception {
        newsWriteDao.updateNews(newsid,status,deadline);
    }
}
