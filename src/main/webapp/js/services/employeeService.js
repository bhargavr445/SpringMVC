var services = angular.module('employeeService',['ngResource']);

services.factory('employeeService', function($resource) {
	return $resource('rest/Employee/:action',{},
			{
		searchEmployeeById:{
			method: 'POST', isArray: true,
			params: {'action' : 'searchEmployeeById'}
		},
		getAllId : {
			method : 'GET', isArray: true,
			params : {'action':'getAllId'}
		},
		searchBylocation : {
			method : 'POST', isArray : false,
			params:{'action':'searchBylocation'}
		},
		getDepartment : {
			method : 'POST', isArray : false,
			params : {'action':'getDepartment'}
		}
		
		//searchBylocation
		
	});

});