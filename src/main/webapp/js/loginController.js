app.controller('loginCtrl', function($scope,$http,$log,$location,myService) {
	
	$scope.user = {};
	
	$scope.login = function()
	{	
		myService.login($scope.user,function(success){
			$log.info(success);
			$location.path('/dashboard');
		});
		
		myService.saveData(function(success){
			$log.info(success);
			$location.path('/dashboard');
		});
	}	
	
});