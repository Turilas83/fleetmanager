# fleetmanager
Fleet Manager Spring Boot

# Installation
* Make new folder fleetmanager to C:\ (if you want to install to some other folder, change CSVREAD path to that folder in V2-create_fleetmanager.sql)
* Clone or download repository
* Launch application from command line: "mvn spring-boot:run" or in yor IDE Run As Java Application 

# API endpoints

##Find all cars
GET http://localhost:8080/fleet

##Find one car with id
GET http://localhost:8080/fleet/{id}

##Find all cars with same manufacturer
GET http://localhost:8080/fleet/make/{make}

##Find all cars with same model
GET http://localhost:8080/fleet/model/{model}

##Find all cars between inputed model years
GET http://localhost:8080/fleet/startingYear/{year}/endingYear/{year}

##Add new car
POST http://localhost:8080/fleet

Example JSON object:
{"make":"testi","model":"testi","registration":"XYZ-123","year":2018,"inspectionDate":"2018-01-01","engineSize":2112,"enginePower":125}

##Update car
PUT http://localhost:8080/fleet/{id}

Example JSON object:
{"id:1","make":"testi","model":"testi","registration":"XYZ-123","year":2018,"inspectionDate":"2018-01-01","engineSize":2112,"enginePower":125}

##Delete car
DELETE http://localhost:8080/fleet/{id}




