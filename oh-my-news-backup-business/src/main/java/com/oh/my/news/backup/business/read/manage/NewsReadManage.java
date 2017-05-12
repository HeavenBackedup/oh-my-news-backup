package com.oh.my.news.backup.business.read.manage;

import com.oh.news.backup.model.dto.NewsDto;
import com.oh.news.backup.model.po.News;

import java.util.List;

/**
 * Created by llf on 2017/5/10.
 */
public interface NewsReadManage {
    List<News> query(NewsDto newsDto) throws Exception;
    Integer queryNum(NewsDto newsDto) throws Exception;
}
