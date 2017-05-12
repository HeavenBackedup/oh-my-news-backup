package com.oh.my.news.backup.business.write.dao;

import java.util.Date;

/**
 * Created by llf on 2017/5/10.
 */
public interface NewsWriteDao {
    void updateNews(Integer newsid, Integer status, Date deadline) throws Exception;
}
