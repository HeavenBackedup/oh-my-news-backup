package com.oh.my.news.backup.business.write.manage.impl;

import com.oh.my.news.backup.business.write.dao.UserWriteDao;
import com.oh.my.news.backup.business.write.manage.UserWriteManage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/8.
 */
@Service
public class UserWriteManageImpl implements UserWriteManage {
    @Autowired
    private UserWriteDao userWriteDao;
    public boolean update(Integer userid, Integer status, Date deadline) throws Exception {
        userWriteDao.updateUser(userid,status,deadline);
        return true;
    }
}
