package com.oh.my.news.backup.web.controller;

import com.oh.my.news.backup.web.util.BaseAction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by llf on 2017/5/10.
 */
@Controller
@RequestMapping(value = "/loginVerify")
public class LoginAction extends BaseAction {
    @RequestMapping(value = "/verify",consumes = APPLICATION_JSON,method = RequestMethod.POST)
    public @ResponseBody Object verifyUser(@RequestBody Map map){
        boolean isform=false;
        String username=map.get("username").toString().trim();
        String password=map.get("password").toString().trim();
        if(username.equals("manager")&&password.equals("123456")){
            isform=true;
        }
        return  successReturnObject(isform);
    }
}
