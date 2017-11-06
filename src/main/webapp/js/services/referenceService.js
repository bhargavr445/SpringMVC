var services = angular.module('ref.services',['ngResource']);

services.factory('refService', function($resource) {
	return $resource('rest/Student/:action',{},
			{		
				getEmpData :{
					method:'POST', isArray:true,
					params: {'action':'getEmpData'}
				},	
	});
});