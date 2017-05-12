/**
 * Created by llf on 2017/4/18.
 */
app.controller('contentVerifyController', ['$scope','$http','contentVerifyService','$stateParams','$state','$rootScope', function ($scope,$http,contentVerifyService,$stateParams,$state,$rootScope) {
    // 初始化所需要变量
    $scope.init = function () {
        $scope.remind="";
        if($rootScope.id!=1){
            $scope.remind="请登录!";
           $('#remindModal').modal('show');
           $('#remindModal').on('hidden.bs.modal',function () {
               $state.go("login");
           })

        }
        $scope.news = {};
        $scope.newsname = "";
        $scope.userid = $stateParams.userId;
        $scope.status = null;
        $scope.issuetime = null;
        $scope.sort = null;
        $scope.pagination={};
        $scope.pagination.totalItems =10;
        $scope.pagination.currentPage = 1;
        $scope.pagination.maxSize = 10;
        $scope.modalNews={};
        $scope.modalVerifyNews = {status: 0, deadline: null};
        $scope.modalNews.status = 0
        $scope.isform=false;
        $scope.sort=null;

        if($scope.userid!=null){
            $scope.submitVerifyInfo();
        }
    }
    // 清空
    $scope.empty=function () {
        $scope.userid=null;
        $scope.newsname="";
        $scope.status=null;
        $scope.registertime=null;
        $scope.sort=null;
    }
    // 提交搜索请求条件
    $scope.submitVerifyInfo = function () {
        var queryInfo = {};
        queryInfo.userid = $scope.userid;
        queryInfo.newsname = $scope.newsname;
        queryInfo.status = $scope.status;
        queryInfo.issuetime = $scope.issuetime;
        queryInfo.sort=$scope.sort;
        queryInfo.currentPage=$scope.pagination.currentPage;
        console.info(angular.toJson(queryInfo));
        contentVerifyService.newsQueryInfo(queryInfo, function (data) {
            $scope.news=data.newsInfo;
            $scope.pagination.currentPage=data.pagination.currentPage;
            $scope.pagination.totalItems=data.pagination.totalItems*10;
            console.info($scope.news);
        }, function (data) {

        })
    }
    $scope.modifystate=function (newInfo) {
        $scope.modalNews=newInfo;
    }
    $scope.closeModal = function () {
        $('#myModal').modal('hide');
    };
    // 修改状态
    $scope.submitModifyInfo = function () {
        var newsInfo={};
        $scope.modalNews.status = $scope.modalVerifyNews.status;
        if( $scope.modalNews.status !=1&& $scope.modalVerifyNews.deadline !=null){
            $scope.modalVerifyNews.deadline =null;
            $scope.modalNews.deadline=null;
        }
        $scope.modalNews.deadline = $scope.modalVerifyNews.deadline;

        newsInfo.newsid=$scope.modalNews.newsid;
        newsInfo.status=$scope.modalNews.status;
        newsInfo.deadline=$scope.modalNews.deadline;
        contentVerifyService.submitnewsVerifyInfo(newsInfo, function (data) {
            $scope.isform=data;
            if($scope.isform==true)
            {
                $scope.remind="修改成功!";
               $('#remindModal').modal();
            } else {
                $scope.remind="修改失败!";
              $('#remindModal').modal();
            }
        }, function (data) {

        })
    }
    // 详情
    $scope.jumpPersonalPage=function (newInfo) {
        if(newInfo.status!=0){
            $scope.remind="被封禁用户不能查看个人主页！";
            $('#remindModal').modal('show');
        }
        else{
                myfunction(newInfo.newsid);
        }
    }
}])
function myfunction(newsid) {
    window.open("http://114.215.97.149:8080/oh-my-news-web/#!/app/detail/"+newsid);
}