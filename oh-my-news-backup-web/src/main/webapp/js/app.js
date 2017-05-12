/**
 * back-user anglanjs 相关注册
 * */

'use strict';

var app =angular
    .module('app', [
        'ngAnimate',
        'ngAria',
        'ngCookies',
        'ngMessages',
        'ngResource',
        'ngSanitize',
        'ngTouch',
        'ui.router',
        'ui.bootstrap',
        'ui.load',
        'ui.jq',
        'ui.validate',
        'ngFileUpload',
        'ui.bootstrap.pagination',
        'ui.bootstrap.datetimepicker'
    ])
    .run(
        [  '$rootScope', '$state', '$stateParams',
            function ($rootScope,   $state,   $stateParams) {
                $rootScope.$state = $state;
                $rootScope.$stateParams = $stateParams;
            }
        ]
    )
    .config(['$stateProvider', '$urlRouterProvider', '$controllerProvider', '$compileProvider', '$filterProvider', '$provide',
        function ($stateProvider,   $urlRouterProvider,   $controllerProvider,   $compileProvider,   $filterProvider,   $provide) {
            app.controller = $controllerProvider.register;
            app.directive  = $compileProvider.directive;
            app.filter     = $filterProvider.register;
            app.factory    = $provide.factory;
            app.service    = $provide.service;
            app.constant   = $provide.constant;
            app.value      = $provide.value;
    $urlRouterProvider.otherwise('/login');

    $stateProvider
        .state('app', {
            abstract: true,
            url: '/app',
            templateUrl: 'module/app.html'
        })
        .state('login',{
            url:'/login',
            templateUrl:'module/verify/login.html',
            controller:'loginController'

        })
        .state('app.userVerify', {
            url: '/userVerify',
            templateUrl: 'module/verify/user_verify.html',
            controller: 'userVerifyController',

        })
        .state('app.contentVerify',{
            url: '/contentVerify',
            templateUrl: 'module/verify/content_verify.html',
            controller: 'contentVerifyController',
            params:{"userId":null}
        })
        .state('app.testHtml',{
            url: 'testHtml',
            templateUrl: 'module/verify/test_html.html',
            controller: 'testHtmlController',
        })
        .state('error',{
            url: '/error',
            templateUrl: 'module/error.html',
            controller: 'errorController'
        })


}]);