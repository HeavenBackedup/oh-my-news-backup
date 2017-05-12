package com.oh.my.news.backup.business.write.dao;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/8.
 */
public interface UserWriteDao {
    void updateUser(Integer userid,Integer status, Date deadline) throws Exception;
}
