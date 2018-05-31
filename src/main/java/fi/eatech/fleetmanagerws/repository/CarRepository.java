package fi.eatech.fleetmanagerws.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fi.eatech.fleetmanagerws.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {

}
