package com.oh.my.news.backup.web.controller;

import com.oh.my.news.backup.business.read.manage.UserReadManage;
import com.oh.my.news.backup.business.write.manage.UserWriteManage;
import com.oh.my.news.backup.web.util.BaseAction;
import com.oh.news.backup.model.dto.UserDto;
import com.oh.news.backup.model.vo.Pagination;
import com.oh.news.backup.model.vo.User;
import com.oh.news.backup.model.vo.UserVerifyInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import static com.oh.my.news.backup.web.util.BaseAction.APPLICATION_JSON;

/**
 * Created by llf on 2017/4/21.
 */
@Controller
@RequestMapping(value = "/userVerify")
public class UserVerifyAction extends BaseAction {
    @Resource
    private UserReadManage userReadManage;

    @RequestMapping(value = "/userInfo", consumes = APPLICATION_JSON, method = RequestMethod.POST)
    public
    @ResponseBody
    Object submitInfo(@RequestBody UserVerifyInfo user) throws Exception{

        UserDto userDto=new UserDto();
        userDto.setUserid(user.getUserid());
        userDto.setUsername(user.getUsername());
        userDto.setRegistertime(user.getRegistertime());
        userDto.setStatus(user.getStatus());
        userDto.setSort(user.getSort());
        userDto.setCurrentPage(user.getCurrentPage());
        userDto.setPageItemNum(6);
        Integer totalItems=userReadManage.queryNum(userDto);
        if(totalItems%6==0){
            totalItems=totalItems/6;
        }
        else{
            totalItems=totalItems/6+1;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("pagination",new Pagination(totalItems,userDto.getCurrentPage()));
        map.put("userInfo",  userReadManage.query(userDto));
        return successReturnObject(map);
    }
//根据id向服务器发送请求，修改状态和截止时间
    @Resource
    private UserWriteManage userWriteManage;
    @RequestMapping(value = "/userVerifyInfo", consumes = APPLICATION_JSON, method = RequestMethod.POST)
    public
    @ResponseBody
    Object verifyInfo(@RequestBody User user) throws Exception{
        boolean isform = false;
        Integer userid=user.getUserid();
        Integer status=user.getStatus();
        Date deadline=new Date();
        deadline=user.getDeadline();
        System.out.println(userid+" "+status+" "+deadline);
        isform=userWriteManage.update(userid,status,deadline);
        return successReturnObject(isform);
    }
}
