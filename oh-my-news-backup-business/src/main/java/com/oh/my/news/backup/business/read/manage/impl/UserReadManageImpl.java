package com.oh.my.news.backup.business.read.manage.impl;

import com.oh.my.news.backup.business.read.dao.UserReadDao;
import com.oh.my.news.backup.business.read.manage.UserReadManage;
import com.oh.news.backup.model.dto.UserDto;
import com.oh.news.backup.model.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
@Service
public class UserReadManageImpl implements UserReadManage {
    @Autowired
    private UserReadDao userReadDao;
    public List<User> query(UserDto userDto) throws Exception {
        return userReadDao.queryUser(userDto);
    }

    public Integer queryNum(UserDto userDto) throws Exception {
        return userReadDao.queryUserNum(userDto);
    }
}
