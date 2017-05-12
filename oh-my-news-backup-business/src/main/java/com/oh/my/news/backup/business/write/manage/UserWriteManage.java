package com.oh.my.news.backup.business.write.manage;

import java.util.Date;

/**
 * Created by Administrator on 2017/5/8.
 */
public interface UserWriteManage {
    boolean update(Integer userid, Integer status, Date deadline)throws Exception;
}
