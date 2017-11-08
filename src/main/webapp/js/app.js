var app = angular.module('myOwnApp', ['ngRoute','myApp.services',
	'BarcodeService',
	'employeeService','dispalyService', 'contractService','ui.utils',
	'ui.bootstrap','reference','xeditable']);
app.config(['$routeProvider', '$locationProvider', '$httpProvider', function($routeProvider,$locationProvider,$httpProvider){
  $routeProvider
  .when('/home', {
    templateUrl:'view/home.html',
    controller:'myCtrl'
  })
.when('/barcode',{
  templateUrl:'view/payroll/barcodeMain.html',
  controller:'barcodeController'
})
.when('/student',{
  templateUrl:'view/studentLogin.html',
  controller:'myCtrl'
})
.when('/addStudent',{
  templateUrl:'view/payroll/addStudent.html',
  controller:'barcodeController'
})
.when('/editStudent',{
	templateUrl:'view/payroll/editStudent.html',
	controller:'barcodeEditController'
})
.when('/barcodeScan',{
  templateUrl:'view/payroll/scan.html',
  controller:'barcodeController'
})
.when('/contract',{
	templateUrl:'view/contract/contractMain.html',
		controller: 'contractController'
})
.when('/editStudentContract',{
	templateUrl:'view/contract/editStudentContract.html',
	controller: 'editContractController'
})
.when('/editContract',{
	templateUrl:'view/contract/contractEdit.html',
	controller: 'editContractController2'
})
.when('/editStudentHome',{
	templateUrl : 'view/editStudent.html',
	controller : 'StudentEditController'
})
.when('/employee',{
	  templateUrl : 'view/EmployeeAndDept/EmpAndDept.html',
	  controller : 'employeeController'
  })
  .when('/addEmployee',{
	  templateUrl : 'view/EmployeeAndDept/EmployeeAdd.html',
	  controller : 'employeeController'
  })
  .when('/home',{
	  templateUrl : 'view/editStudent.html',
		controller : 'StudentEditController'
  })
.otherwise({
  redirectTo:'/home'
});
 $locationProvider.hashPrefix('');
}]);