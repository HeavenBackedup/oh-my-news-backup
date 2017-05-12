/**
 * Created by llf on 2017/4/20.
 */
app.service('contentVerifyService',['$http','routeUtil','ajaxRollback',function ($http,routeUtil,ajaxRollback) {
    var contentVerifyService={};
    var VERIFY='/newsVerify/newsInfo';
    var VERIFYUSER='/newsVerify/submitnewsVerifyInfo';
   contentVerifyService.newsQueryInfo=function (param,success,failed,otherwise) {
        routeUtil.postUrl(VERIFY,param,ajaxRollback.successRollBack(success,failed,otherwise),ajaxRollback.errorRollBack())
    }
    contentVerifyService.submitnewsVerifyInfo=function (param,success,failed,otherwise) {
        routeUtil.postUrl(VERIFYUSER,param,ajaxRollback.successRollBack(success,failed,otherwise),ajaxRollback.errorRollBack())
    }
    return contentVerifyService;
}])

