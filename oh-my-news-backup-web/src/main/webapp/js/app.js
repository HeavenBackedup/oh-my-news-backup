/**
 * back-user anglanjs 相关注册
 * */

'use strict';

var app = angular.module("app", ['ui.bootstrap','tm.pagination', 'ui.router','searchFilters'], function ($httpProvider) {
    $httpProvider.defaults.headers.post['Content-Type'] = 'application/json';
    $httpProvider.defaults.headers.post['X-Requested-With'] = 'XMLHttpRequest';
})
    .run(
    [          '$rootScope', '$state', '$stateParams',
        function ($rootScope,   $state,   $stateParams) {
            $rootScope.$state = $state;
            $rootScope.$stateParams = $stateParams;
        }
    ]
)
    .config(function ($stateProvider, $urlRouterProvider) {
    $urlRouterProvider.otherwise('/app/userVerify');

    $stateProvider
        .state('app', {
            abstract: true,
            url: '/app',
            templateUrl: 'module/app.html'
        })
        .state('app.userVerify', {
            url: '/userVerify',
            templateUrl: 'module/verify/user_verify.html',
            controller: 'userVerifyController'
        })
        .state('app.contentVerify',{
            url: 'contentVerify',
            templateUrl: 'module/verify/content_verify.html',
            controller: 'contentVerifyController'
        })
        .state('error',{
            url: '/error',
            templateUrl: 'module/error.html',
            controller: 'errorController'
        })


});