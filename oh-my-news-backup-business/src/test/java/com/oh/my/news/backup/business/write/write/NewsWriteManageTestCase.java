package com.oh.my.news.backup.business.write.write;

import com.oh.my.news.backup.business.write.dao.NewsWriteDao;
import com.oh.my.news.backup.business.write.manage.NewsWriteManage;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Created by llf on 2017/5/12.
 */

public class NewsWriteManageTestCase extends TestCase {
    private NewsWriteManage newsWriteManage;

    public NewsWriteManageTestCase() {
        System.setProperty("global.config.path","D:/gitcode/env/env-dev");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:oh-my-news-backup-business/spring-service.xml");
        this.newsWriteManage = (NewsWriteManage)applicationContext.getBean("newsWriteManageImpl");
    }
    public void testUpdate1(){
        try {
            this.newsWriteManage.update1(3,2,null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
