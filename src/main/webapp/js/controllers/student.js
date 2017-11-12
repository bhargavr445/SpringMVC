app.controller('studentController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
			
	
	
	
	
	$scope.searchById = function(){
//		StudentService.searchById($scope.contact, function(data){
//			$scope.studentScanResult = data;
//			
//			$scope.studentFmsResult = data;
//		})
		
		$log.console("Submit Button working ");
		
	};
	


	
	$scope.getAllData = function(){
		BarcodeService.getAllData(function(data){
			$scope.studentScanResult = data;
		})
	}
	
	$scope.getSelectedData = function(selectedData){
		$rootScope.deptName = selectedData;
		BarcodeService.getSelectedData($.param({deptName : selectedData}), function(data){
			$scope.studentScanResult = data;
		})
	}
	
	$scope.getSal = function(empName){
		BarcodeService.getSalInfo($.param({name : empName}),function(data){
			$scope.salDetails = data;
		})
	}

	
	
	
	
		  
		  
		 
	  
		  
});

app.controller('barcodeEditController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
	
//	$scope.student = $rootScope.student;
//	
//	$scope.originalStudent = angular.copy($scope.student);
	
	BarcodeService.getDataDisplay($.param({name: $rootScope.empName}),function(data){
		$scope.student = data;
		$scope.originalStudent = angular.copy($scope.student);
	})
	
	$scope.reset = function(){
		$scope.student = angular.copy($scope.originalStudent);
	};
	
	
	
	$scope.editStudent = function(student){
		BarcodeService.editStudent(student, function(data){
			$scope.msg = data;
			$location.path('/barcode');
		});
	};
//	back button function.
	$scope.goToScan = function(){
		$location.path('/barcode');
	};
	
	
	
	
});

app.directive('capitalize', function() {
    return {
      require: 'ngModel',
      link: function(scope, element, attrs, modelCtrl) {
        var capitalize = function(inputValue) {
          if (inputValue == undefined) inputValue = '';
          var capitalized = inputValue.toUpperCase();
          if (capitalized !== inputValue) {
            modelCtrl.$setViewValue(capitalized);
            modelCtrl.$render();
          }
          return capitalized;
        }
        modelCtrl.$parsers.push(capitalize);
        capitalize(scope[attrs.ngModel]); // capitalize initial value
      }
    };
  });


