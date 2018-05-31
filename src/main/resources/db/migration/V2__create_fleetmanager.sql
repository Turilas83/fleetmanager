CREATE TABLE FLEETMANAGER(
	id INT AUTO_INCREMENT,
	make VARCHAR(255),
	model VARCHAR(255),
	registration VARCHAR(255),
	year INT,
	inspectionDate DATE,
	engineSize INT,
	enginePower INT
);

insert into FLEETMANAGER (make, model, registration, year, inspectionDate, engineSize, enginePower) values ('make4','model17','MMQ-050',2003,'2018-05-08',2111,124);
insert into FLEETMANAGER (make, model, registration, year, inspectionDate, engineSize, enginePower) values ('make9','model12','ODU-748',1999,'2018-03-25',1423,71);