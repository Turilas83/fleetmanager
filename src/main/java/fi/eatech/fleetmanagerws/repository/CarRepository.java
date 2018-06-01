package fi.eatech.fleetmanagerws.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fi.eatech.fleetmanagerws.model.Car;

public interface CarRepository extends JpaRepository<Car, Long> {
	
	List<Car> findByMake(String make);
	List<Car> findByModel(String model);
	List<Car> findByYearBetween(Integer startingYear, Integer endingYear);

}
