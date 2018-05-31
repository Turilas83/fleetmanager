package fi.eatech.fleetmanagerws.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.eatech.fleetmanagerws.model.Car;
import fi.eatech.fleetmanagerws.repository.CarRepository;

@RequestMapping("/fleet")
@RestController
public class FleetController {

	@Autowired
	private CarRepository carRepository;
	
	@SuppressWarnings("rawtypes")
	@GetMapping("/health")
    public ResponseEntity getHealth() {
        return ResponseEntity.ok("System up");
    }
    @RequestMapping(value = "/cars", method = RequestMethod.GET)
    public List<Car> list() {
    	return carRepository.findAll();
    }
    @RequestMapping(value = "add/{id}", method = RequestMethod.POST)
    public Car create(@RequestBody Car car) {
    	return carRepository.saveAndFlush(car);
    }
    @RequestMapping(value = "find/{id}", method = RequestMethod.GET)
    public Car get(@PathVariable Long id) {
    	return carRepository.findOne(id);
    }
    @RequestMapping(value = "update/{id}", method = RequestMethod.PUT)
    public Car update(@PathVariable Long id, @RequestBody Car car) {
    	Car existingCar = carRepository.findOne(id);
    	BeanUtils.copyProperties(car, existingCar);
    	return carRepository.saveAndFlush(existingCar);
    }
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public Car delete(@PathVariable Long id) {
    	Car existingCar = carRepository.findOne(id);
    	carRepository.delete(existingCar);
    	return existingCar;
    }
 }

