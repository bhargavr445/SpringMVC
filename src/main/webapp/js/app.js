var app = angular.module('myOwnApp', ['ngRoute']);
app.config(['$routeProvider', '$locationProvider', '$httpProvider', function($routeProvider,$locationProvider,$httpProvider){
  $routeProvider
  .when('/parent', {
    templateUrl:'WEB-INF/views/parent.html',
    controller:'myCtrl'
  })
.otherwise({
  redirectTo:'/home'
});
 $locationProvider.hashPrefix('');
}]);