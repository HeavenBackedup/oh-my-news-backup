package com.oh.my.news.backup.business.write.dao;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by llf on 2017/5/10.
 */
public class NewsWriteDaoTestCase extends TestCase {
    private NewsWriteDao newsWriteDao;

    public NewsWriteDaoTestCase() {
        System.setProperty("global.config.path","D:/gitcode/env/env-dev");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:oh-my-news-backup-business/spring-service.xml");
        this.newsWriteDao = (NewsWriteDao)applicationContext.getBean("newsWriteDaoImpl");
    }
    public void testUpdateNews(){
        try {
            this.newsWriteDao.updateNews(3,2,null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
