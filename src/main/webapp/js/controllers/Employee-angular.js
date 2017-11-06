app.controller('employeeController', function($scope, employeeService,$rootScope,$http,$log,$location) {
			
	if($rootScope.emp != undefined && $rootScope.emp != null){
		$scope.emp.empNo = $rootScope.emp.empNo;
		employeeService.searchEmployeeById($rootScope.emp, function(data){
			$scope.empList = data;
		});
	}
	
	
	$scope.searchById = function(){
		$rootScope.emp = $scope.emp;
		$rootScope.emp.empNo = $scope.emp.empNo;
		employeeService.searchEmployeeById($scope.emp, function(data){
			$scope.empList = data;
			$log.info($scope.empList);
		});
	};
	
	
	
	
	employeeService.getAllId(function(data){
		$scope.idList = data;
	});
	
	$scope.getDepartment = function(employee){
		$scope.department = employee;
		employeeService.getDepartment($scope.department, function(data){
			deptList = data;
		})
	};
	
	$scope.searchBylocation = function(location){
		var dept = {};
		dept.loc = location;
		employeeService.searchBylocation($.param({location: location}), function(data){
			$scope.dept = data;
			$scope.empList = data.empList;
			$log.info(data);
		});
	};
	
	$scope.addEmployee = function(){
		$location.path('/addEmployee');
	}
	
	$scope.testSession = function(){
		$location.path('/employee');
	}
	
	
	
	
	
	

});



