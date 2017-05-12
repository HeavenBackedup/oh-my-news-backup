package com.oh.my.news.backup.business.write.dao;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Created by Administrator on 2017/5/9.
 */
public class UserWriteDaoTestCase extends TestCase {
    private UserWriteDao userWriteDao;

    public UserWriteDaoTestCase() {
        System.setProperty("global.config.path","D:/gitcode/env/env-dev");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:oh-my-news-backup-business/spring-service.xml");
        this.userWriteDao = (UserWriteDao)applicationContext.getBean("userWriteDaoImpl");
    }
    public void testUpdateUser(){
        try {
            this.userWriteDao.updateUser(1,2,null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
