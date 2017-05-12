/**
 * Created by llf on 2017/4/18.
 */
app.controller('userVerifyController', ['$scope','$rootScope', '$state','$filter', 'userVerifyService', function ($scope,$rootScope, $state,$filter, userVerifyService) {
    // 初始化所需要变量
    $scope.init = function () {
        $scope.remind="";
        if($rootScope.id!=1){
            $scope.remind="请登录！";
            $('#remindModal').modal('show');
            $('#remindModal').on('hidden.bs.modal',function () {
                $state.go("login");
            })
        }
        $scope.users = {};
        $scope.userid = "";
        $scope.username = "";
        $scope.registertime = "";
        $scope.status = null;
        $scope.modalUser = {};
        $scope.pagination = {};
        $scope.pagination.totalItems = 10;
        $scope.pagination.currentPage = 1;
        $scope.pagination.maxSize = 10;
        $scope.modalVerifyUser = {status: 0, deadline: null};
        $scope.modalUser.status = 0;
        $scope.isform = false;
        $scope.sort = null;
        $scope.isform1 = true;

    }

    //清空
    $scope.empty = function () {
        $scope.userid = "";
        $scope.username = "";
        $scope.registertime = "";
        $scope.status = null;
        $scope.sort = null;
    }
    // 提交搜索请求条件
    $scope.submitVerifyInfo = function () {
        var queryInfo = {};
        queryInfo.userid = $scope.userid;
        queryInfo.username = $scope.username;
        queryInfo.registertime = $scope.registertime;
        queryInfo.status = $scope.status;
        queryInfo.currentPage = $scope.pagination.currentPage;
        queryInfo.sort = $scope.sort;
        userVerifyService.userQueryInfo(queryInfo, function (data) {
            $scope.users = data.userInfo;
            $scope.pagination.totalItems = data.pagination.totalItems*10;
            $scope.pagination.currentPage = data.pagination.currentPage;
        }, function (data) {

        })
    }

    $scope.modifystate = function (user) {
        $scope.modalUser = user;
    }
    $scope.closeModal = function () {
        $('#myModal').modal('hide');
    };
    // 修改状态
    $scope.submitModifyInfo = function () {
        var userInfo={};

        $scope.modalUser.status = $scope.modalVerifyUser.status;

        if ($scope.modalVerifyUser.status != 1 && $scope.modalVerifyUser.deadline != null) {
            $scope.modalVerifyUser.deadline = null;
            $scope.modalUser.deadline=null;
        }
        $scope.modalUser.deadline = $scope.modalVerifyUser.deadline;
       userInfo.userid=$scope.modalUser.userid;
        userInfo.status=$scope.modalUser.status;
        userInfo.deadline=$scope.modalUser.deadline;
        console.info(userInfo);
        userVerifyService.submituserVerifyInfo(userInfo, function (data) {
            $scope.isform = data;
            if ($scope.isform == true) {
               $scope.remind="修改成功！";
               $('#remindModal').modal();
            }
            else {
             $scope.remind="修改失败！";
             $('#remindModal').modal();
            }
        }, function (data) {

        })


    }
    // 详情跳页
    $scope.jumpPage = function (user) {
        $state.go('app.contentVerify', {userId: user.userid});
    }
}])