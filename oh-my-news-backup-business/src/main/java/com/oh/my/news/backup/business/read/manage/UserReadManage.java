package com.oh.my.news.backup.business.read.manage;

import com.oh.news.backup.model.dto.UserDto;
import com.oh.news.backup.model.po.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
public interface UserReadManage {
    List<User> query(UserDto userDto) throws  Exception;
    Integer queryNum(UserDto userDto) throws Exception;
}
