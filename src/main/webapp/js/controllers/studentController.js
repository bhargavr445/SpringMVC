app.factory('insuranceService', function($resource) {
	return $resource('rest/Student/:action',{},
			{		
				loadStudentData :{
					method:'GET', isArray:true,
					params: {'action':'loadStudentData'}
				}	
	});
});

app.controller('insuranceCtrl', function($scope,$http,$log,$location,insuranceService) {
	studentService.loadStudentData(function(data){
		$scope.studentdetails = data;
	})
});