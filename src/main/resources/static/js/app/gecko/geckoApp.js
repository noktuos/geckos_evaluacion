
var app = angular.module('geckoModule', [])
    .controller('geckoController', function($http, $scope, $window){

        // Variable
        $scope.gecko = {};

        // Arreglo
        $scope.geckos = [];

        function list(){

            $http.get('/gecko/list').then((response) => {

                $scope.geckos = response.data;

            });

        }

        $scope.add = (gecko) => {

            $http.post('/gecko/add', gecko).then(
            (response) => {
                $scope.gecko = {};
                list();
            })


        };

        $scope.selectEdit = (gecko) => {

            $scope.gecko = gecko;

        };

        $scope.edit = (gecko) => {
            $http.put('/gecko/update/' + gecko.id, gecko).then((response) => {
                list();
                console.log(gecko);
            });

        };


        $scope.delete = (gecko) => {

            $http.delete('/gecko/delete/' + gecko.id).then((response) => {
                list();
            });

        };

        list();

    });