package com.oh.my.news.backup.business.read.dao;

import com.oh.news.backup.model.dto.UserDto;
import com.oh.news.backup.model.po.User;

import java.util.List;

/**
 * Created by Administrator on 2017/5/8.
 */
public interface UserReadDao {
    List<User> queryUser(UserDto userDto) throws Exception;
    Integer queryUserNum(UserDto userDto) throws Exception;
}
