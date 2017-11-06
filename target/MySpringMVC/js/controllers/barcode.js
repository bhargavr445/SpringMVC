app.controller('barcodeController', function($scope,$rootScope,$http,$log,$location,BarcodeService) {
			
	$scope.contact = {};
	$scope.department = {};
	
	$scope.tabs = [
					{ title:"Search", page:"view/payroll/barcodeSearch.html", active: true },
					{ title:"View", page:"view/payroll/view.html" },
					{ title:"Scan", page:"view/payroll/scan.html" },
					{ title:"FMS", page:"view/payroll/barcodeSearch.html" },
					{ title:"SCAN w/o QA", page:"view/payroll/scanwithoutQa.html"},
					{ title:"Test", page:"view/payroll/test.html"}
	               
	               ];
	
	if($rootScope.index != undefined && $rootScope.index != null){
		$scope.tabs[$rootScope.index].active = true;
		if($rootScope.index == 2){
			
			$scope.selectedDept = $rootScope.deptName;
			//$scope.getSelectedData($scope.selectedDept);
			BarcodeService.getSelectedData($.param({deptName : $scope.selectedDept}), function(data){
				$scope.studentScanResult = data;
			})
		}
	}
	
	
	BarcodeService.getDepartments(function(data){
		
		$scope.departmentsList = data;
		$log.info($scope.departmentsList);
		$scope.departmentsList.splice(0,0,{
			"department" : "ALL"
		});
	});
	
	$scope.goToScan = function(){
		$location.path('/barcode');
	};
		
	$scope.selectedIndex = function(index){
		$rootScope.index = index;	
	};
	
	$scope.salaryTypeChnaged = function (annualSalary) {
        $scope.salaryRange = annualSalary;
        $log.info($scope.salaryRange);
//		if ($scope.AccountStatus == 'checking') {
//				$scope.isHideCheck = !$scope.isHideCheck;
//                
//			} else if ($scope.AccountStatus == 'saving'){
//				$scope.isHideSave = !$scope.isHideSave;
//               
//				}
    };
	
	$scope.addNewStudent= function(){
		BarcodeService.addNewStudent($scope.addStudent,function(data){
			$scope.msg = data; 
			$log.info($scope.msg);
			$location.path('/barcode');
		})
	};
	
	$scope.deleteStudent = function(student){
		BarcodeService.deleteStudent(student, function(result) {
			$scope.msg = result;
		})
	};
	
	$scope.scanSubmit = function(){
		BarcodeService.submitStudent($scope.contact, function(data){
			$scope.studentScanResult = data;
			
			$scope.studentFmsResult = data;
		})
		
		
	};
	
//	$scope.item.department = {};
//	item.department = "Select";
	
//	$scope.items = [{
//	    'name': 'Item 1'
//	  }, {
//	    'name': 'Item 2'
//	  }, {
//	    'name': 'Account 3'
//	  }, {
//	    'name': 'Account 4'
//	  }, {
//	    'name': 'Item 5'
//	  }, {
//	    'name': 'Item 6'
//	  }, {
//	    'name': 'User 7'
//	  }, {
//	    'name': 'User 8'
//	  }];
	BarcodeService.getDepartments(function(data){
		$scope.items = data;
		//$log.info($scope.departmentsList);
//		$scope.items.splice(0,0,{
//			"department" : "ALL"
//		});
	});
//	$('.dropdown-menu').find('input').click(function(e) {
//		  e.stopPropagation();
//		});
	
	BarcodeService.getRegionIdlist(function(data){
		$scope.regionList = data;
		//$scope.regionList.splice(0,0,"ALL");
	});
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

	$scope.goToview = function(student){
		$scope.tabs[1].active=true;
		$
		BarcodeService.getListByJobTitle(student,function(data){
			$scope.empListWithJobTitle = data;
		});
		
	};
	
	$scope.editStudent = function(student){
		$rootScope.empName = student.name;
			$location.path('/editStudent');
		}
	
	
	
	$scope.searchByName = function(){
		BarcodeService.searchByName($scope.emp, function(data){
			$scope.empList = data;
		});
	};
	
	$scope.getIndex = function($index, student){
		$scope.selectedIndex = [];
		BarcodeService.getListByJobTitle(student[$index].name,function(data){
			$scope.empListWithJobTitle = data;
		});
		$scope.selectedIndex.push($scope.index);
		$log.info($scope.selectedIndex);
	};
	
	$scope.choices = [
//						{id: 'choice1'}, 
//						{id: 'choice2'}
					];
	
	$scope.addNewChoice = function() {
	    var newItemNo = $scope.choices.length +1;
	    $scope.choices.push({'id':'choice'+newItemNo});
	  };
	  
	  
	  $scope.removeChoice = function() {
		    var lastItem = $scope.choices.length-1;
		    $scope.choices.splice(lastItem);
		  };

		  
		  
		 $scope.searchByAll = function(){
			 $rootScope.empName = $scope.student.name;
		 };
		 
		 
		 $scope.searchByNameTest = function(name){
			 BarcodeService.searchByNameTest($.param({name : name}), function(data){
				  $scope.testrecord = data;
				  $log.info($scope.testrecord);
			 })
		 };
		  
		  
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


