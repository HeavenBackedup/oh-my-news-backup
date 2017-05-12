package com.oh.my.news.backup.business.read.dao;

import com.oh.news.backup.model.dto.UserDto;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/8.
 */
public class UserReadDaoTestCase extends TestCase {
    private UserReadDao userReadDao;

    public UserReadDaoTestCase() {
        System.setProperty("global.config.path","D:/gitcode/env/env-dev");
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:oh-my-news-backup-business/spring-service.xml");
        this.userReadDao = (UserReadDao)applicationContext.getBean("userReadDaoImpl");
    }
    public void testQueryUser(){
        UserDto userDto=new UserDto();
        userDto.setSort(2);
        userDto.setStatus(0);
        userDto.setCurrentPage(1);
        userDto.setPageItemNum(6);
        try {
            System.out.println(this.userReadDao.queryUser(userDto));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
    public void testQueryUserNum(){
        UserDto userDto=new UserDto();
        userDto.setStatus(0);
        try {
            System.out.println(this.userReadDao.queryUserNum(userDto));
        } catch (Exception e) {
            e.printStackTrace();
            Assert.fail();
        }
    }
}
