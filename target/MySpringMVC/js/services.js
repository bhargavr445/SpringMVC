var services = angular.module('myApp.services',['ngResource']);

services.factory('myService', function($resource) {
	return $resource('rest/Student/:action',{},
			{
		login:{
			method: 'POST', isArray: false,
			params: {'action' : 'login'}
		},
		saveData:{
			method: 'POST', isArray: false,
			params: {'action' : 'saveStudent'}
		},
		searchData : {
			method: 'POST', isArray: true,
			params: {'action' : 'searchData'}
		},
		loadStudentData : {
			method : 'GET', isArray: true,
			params:{'action' : 'loadStudentData'}
		},
		loadAllNames : {
			method : 'GET', isArray : true,
			params : {'action':'loadAllNames'}
		},
		deleteStudent : {
			method: 'POST', isArray: false,
			params: {'action' : 'deleteStudent'}
		},
		getSearchData : {
			method : 'POST', isArray: true,
			params: {'action': 'getSearchData'}
		},
		getCounty : {
			method : 'GET', isArray:true,
			params: {'action':'getCountyList'}
		},
		updateStudent : {
			method : 'POST', isArray: false,
			params : {'action':'updateStudent'}
		},
		addHomeStudent : {
			method : 'POST', isArray : false,
			params : {'action':'addHomeStudent'}
		}
	
	});

});