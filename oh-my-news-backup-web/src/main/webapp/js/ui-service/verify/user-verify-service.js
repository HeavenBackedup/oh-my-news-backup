/**
 * Created by llf on 2017/4/20.
 */
app.service('userVerifyService',['$http','routeUtil','ajaxRollback',function ($http,routeUtil,ajaxRollback) {
    var userVerifyService={};
    var VERIFY='/userVerify/userInfo';
    var VERIFYUSER='/userVerify/userVerifyInfo';
    userVerifyService.userQueryInfo=function (param,success,failed,otherwise) {
        routeUtil.postUrl(VERIFY,param,ajaxRollback.successRollBack(success,failed,otherwise),ajaxRollback.errorRollBack())
    }
    userVerifyService.submituserVerifyInfo=function (param,success,failed,otherwise) {
        routeUtil.postUrl(VERIFYUSER,param,ajaxRollback.successRollBack(success,failed,otherwise),ajaxRollback.errorRollBack())
    }
    return userVerifyService;
}])