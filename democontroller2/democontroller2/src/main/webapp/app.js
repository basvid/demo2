angular.module('formExample', [])
    .controller('ExampleController', function($scope, $http) {


    	$scope.contacts = [];
    	$scope.user = {
    			login: "login...",
    			nom: "nom...",
    			prenom: "prenom...",
    		
    			
    	};
    	
    	$scope.saveClient = function() {
    		var client = $scope.user;
    		$http.post('/client', client).success(function(data) {
    			$scope.user = data;
    		});
    	};
    	
    	$scope.asyncLoadClients = function() {
    		$http.get('/getAllClients').success(function(data) {
    			$scope.contacts = data;
    		});
    	}
    });