package com.oh.my.news.backup.business.read.manage;

import com.oh.my.news.backup.business.write.manage.UserWriteManage;
import junit.framework.TestCase;
import org.junit.Assert;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/9.
 */
public class UserWriteManageTestCase extends TestCase {
    private UserWriteManage userWriteManage;

    public UserWriteManageTestCase() {
        System.setProperty("global.config.path","D:/gitcode/env/env-dev");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:oh-my-news-backup-business/spring-service.xml");
        this.userWriteManage = (UserWriteManage)applicationContext.getBean("userWriteManageImpl");
    }
    public void testUpdate(){
        try {
            this.userWriteManage.update(1,2,null);
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
