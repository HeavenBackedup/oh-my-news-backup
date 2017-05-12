/**
 * Created by llf on 2017/5/10.
 */
app.service('loginService',['$http','routeUtil','ajaxRollback',function ($http,routeUtil,ajaxRollback) {
    var loginService={};
    var SUBMIT='/loginVerify/verify';

   loginService.submit=function (param,success,failed,otherwise) {
        routeUtil.postUrl(SUBMIT,param,ajaxRollback.successRollBack(success,failed,otherwise),ajaxRollback.errorRollBack())
    }

    return loginService;
}])
