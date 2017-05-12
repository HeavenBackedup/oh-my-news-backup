package com.oh.my.news.backup.business.read.dao;

import com.oh.news.backup.model.dto.NewsDto;
import com.oh.news.backup.model.po.News;

import java.util.List;

/**
 * Created by llf on 2017/5/10.
 */
public interface NewsReadDao {
    List<News> queryNews(NewsDto newsDto) throws Exception;
    Integer queryNewsNum(NewsDto newsDto) throws Exception;
}
