angular.module('formExample2', [])
    .controller('ExampleController2', function($scope, $http) {


    	$scope.courant = [];
    	$scope.user = {
    			id_compte: "id_compte...",
    			plafond: "plafond...",
    			montant: "montant...",
    			
    	};
    	
    	$scope.saveCourant = function() {
    		var courant = $scope.user;
    		$http.post('/courant', courant).success(function(data2) {
    			$scope.user = data2;
    		});
    	};
    	
    	$scope.asyncLoadCourant = function() {
    		$http.get('/getAllCourant').success(function(data2) {
    			$scope.courant = data2;
    		});
    	}
    });