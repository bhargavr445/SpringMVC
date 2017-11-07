app.controller('displayController', function($scope,$rootScope,$http,$log,$location,contractService) {
	
	$scope.getContractPage = function(){
		dispalyService.getContractPage(function(){
		})
	}
});


