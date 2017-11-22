/**
 * Created by 帅帅 on 2017/11/16.
 */

//定义控制器 ViewController 并注入 $rootScope $scope $http
 actionApp.controller('View1Controller',['$rootScope','$scope','$http',
 function ($rootScope,$scope,$http) {
     //使用$scope.$on 监听 $viewContentLoaded 事件
     $scope.$on('$viewContentLoaded',function(){
         console.log('页面加载完毕');
     });
     //
     $scope.search = function () {
         //3.1 在scope里定义一个search方法 在页面通过 ng-click 调用
         personName = $scope.personName;
         $http.get('search',{
             params:{personName:personName}
         }).success(function (data) {
             $scope.person=data;
         });
     };

 }]);


 actionApp.controller('View2Controller',['$rootScope','$scope',
     function ($rootScope,$scope) {
     $scope.$on('$viewContentLoaded',function () {
         console.log('页面加载完毕');
     });
 }]);