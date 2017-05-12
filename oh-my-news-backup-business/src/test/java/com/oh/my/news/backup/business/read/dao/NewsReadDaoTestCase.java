package com.oh.my.news.backup.business.read.dao;

import com.oh.news.backup.model.dto.NewsDto;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by llf on 2017/5/10.
 */
public class NewsReadDaoTestCase extends TestCase {
    private NewsReadDao newsReadDao;

    public NewsReadDaoTestCase() {
        System.setProperty("global.config.path","D:/gitcode/env/env-dev");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:oh-my-news-backup-business/spring-service.xml");
        this.newsReadDao = (NewsReadDao)applicationContext.getBean("newsReadDaoImpl");
    }
    public void testUpdateNews(){
        NewsDto newsDto=new NewsDto();
        newsDto.setStatus(0);
        newsDto.setSort(2);
        newsDto.setPageItemNum(6);
        newsDto.setCurrentPage(2);
        try {
            System.out.println(this.newsReadDao.queryNews(newsDto));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
    public void testQueryNewsNum() {
        NewsDto newsDto=new NewsDto();
        newsDto.setStatus(0);
        try {
            System.out.println(this.newsReadDao.queryNewsNum(newsDto));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
