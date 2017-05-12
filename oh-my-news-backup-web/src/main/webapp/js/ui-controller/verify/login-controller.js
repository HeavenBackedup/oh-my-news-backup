/**
 * Created by llf on 2017/5/10.
 */
app.controller('loginController',['$scope','$rootScope','loginService','$state',function ($scope,$rootScope,loginService,$state) {
    $scope.init=function () {
        $scope.username="";
        $scope.pwd="";
        $scope.isform=false;
        $rootScope.id=0;
        $scope.remind="";
    }
    $scope.submitInfo=function () {
        var userInfo={};
        userInfo.username=$scope.username;
        userInfo.password=$scope.pwd;
        loginService.submit(userInfo,function (data) {
            $scope.isform=data;
            if($scope.isform==true){
                $rootScope.id=1;
                $state.go("app.userVerify");
            }
            else{
                $scope.remind="用户名或密码错误！";
               $('#remindModal').modal();
            }
        },function (data) {

        })
    }
}])
