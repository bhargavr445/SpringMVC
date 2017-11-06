var reference = angular.module('reference', ['ngRoute','ref.services']);
reference.config(['$routeProvider', '$locationProvider', '$httpProvider', function($routeProvider,$locationProvider,$httpProvider){
  $routeProvider
  .when('/parent3', {
    templateUrl:'view/myPages/parent.html',
    controller:'parentCntlr'
  }).otherwise({
  redirectTo:'/parent3'
});
 $locationProvider.hashPrefix('');
}]);
/*app.directive('myDir',function(randomDetails){
  retutn{
    restrict:'E',
    scope:{
      myDetails:'='
    }
templateUrl:'view/resource',
controller.function($scope){
}
  };
});*/
