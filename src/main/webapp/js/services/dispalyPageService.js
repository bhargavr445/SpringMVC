var services = angular.module('dispalyService',['ngResource']);

services.factory('dispalyService', function($resource) {
	return $resource('springMvc/user/:action',{},
			{
		getStudent : {
			method : 'POST', isArray: true,
			params: {'action':'getEmpByName'}
		},
		searchByJobTitle : {
			method: 'POST', isArray:true,
			params: {'action':'searchByJobTitle'}
		},
		editContractStudent : {
			method : 'POST',isArray : false,
			params : {'action':'editContractStudent'}
		},
		getStudentInImage : {
			method : 'POST',isArray : true,
			params : {'action':'getStudentInImage'}
		},
		getJobTitle : {
			method : 'GET', isArray: true,
			params : {'action':'getjobTitle'}
		},
		searchByNameString : {
			method : 'POST', isArray : true,
			params : {'action':'searchByNameString'}
		},
		deleteContract : {
			method : 'POST',isArray : false,
			params : {'action':'c'}
		},
		searchByName : {
			method : 'POST', isArray: true,
			params : {'action' : 'searchByName'}
		},
		getDeptList : {
			method : 'GET', isArray: true,
			params: {'action':'getDeptListDemo'}
		}
		
	});
});