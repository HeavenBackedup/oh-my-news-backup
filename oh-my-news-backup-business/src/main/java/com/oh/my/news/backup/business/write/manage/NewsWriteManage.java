package com.oh.my.news.backup.business.write.manage;

import java.util.Date;

/**
 * Created by llf on 2017/5/10.
 */
public interface NewsWriteManage {
   boolean update(Integer newsid, Integer status, Date deadline) throws Exception;
   void update1(Integer newsid,Integer status,Date deadline) throws Exception;
}
