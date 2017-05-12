package com.oh.my.news.backup.web.controller;

import com.oh.my.news.backup.business.read.manage.NewsReadManage;
import com.oh.my.news.backup.business.write.manage.NewsWriteManage;
import com.oh.my.news.backup.web.util.BaseAction;
import com.oh.news.backup.model.dto.NewsDto;
import com.oh.news.backup.model.vo.News;
import com.oh.news.backup.model.vo.NewsVerifyInfo;
import com.oh.news.backup.model.vo.Pagination;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

import static com.oh.my.news.backup.web.util.BaseAction.APPLICATION_JSON;

/**
 * Created by llf on 2017/4/26.
 */
@Controller
@RequestMapping(value = "/newsVerify")
public class ContentVerifyAction extends BaseAction {
    @Resource
    private NewsReadManage newsReadManage;

    @RequestMapping(value = "/newsInfo", consumes = APPLICATION_JSON, method = RequestMethod.POST)
    public
    @ResponseBody
    Object submitnewsInfo(@RequestBody NewsVerifyInfo verifyInfo) throws Exception {
        NewsDto newsDto = new NewsDto();
        newsDto.setUserid(verifyInfo.getUserid());
        newsDto.setNewsname(verifyInfo.getNewsname());
        newsDto.setIssuetime(verifyInfo.getIssuetime());
        newsDto.setStatus(verifyInfo.getStatus());
        newsDto.setSort(verifyInfo.getSort());
        newsDto.setCurrentPage(verifyInfo.getCurrentPage());
        newsDto.setPageItemNum(6);
        Integer totalItems = newsReadManage.queryNum(newsDto);
        if (totalItems % 6 == 0) {
            totalItems = totalItems / 6;
        } else {
            totalItems = totalItems / 6 + 1;
        }
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("newsInfo", newsReadManage.query(newsDto));
        map.put("pagination", new Pagination(totalItems, newsDto.getCurrentPage()));
        System.out.println(map);
        return successReturnObject(map);
    }

    @Resource
    private NewsWriteManage newsWriteManage;

    @RequestMapping(value = "/submitnewsVerifyInfo", consumes = APPLICATION_JSON, method = RequestMethod.POST)
    public
    @ResponseBody
    Object verifyInfo(@RequestBody News news) throws Exception {
        boolean isform = false;
        Integer newsid = news.getNewsid();
        Integer status = news.getStatus();
        Date deadline = news.getDeadline();
        isform = newsWriteManage.update(newsid, status, deadline);
        return successReturnObject(isform);
    }
}
