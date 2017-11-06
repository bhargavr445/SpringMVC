reference.controller('parentCntlr', function($scope,$http,$log,refServices) {
	
			$scope.login = function(){	
				refService.getEmpData(function(data){
				$scope.empData=data;
				
			});
		}
			
});