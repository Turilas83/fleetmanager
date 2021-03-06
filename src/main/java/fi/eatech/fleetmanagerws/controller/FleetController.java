package fi.eatech.fleetmanagerws.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.eatech.fleetmanagerws.model.Car;
import fi.eatech.fleetmanagerws.repository.CarRepository;

@RestController
@RequestMapping("/fleet")
public class FleetController {

	@Autowired
	private CarRepository carRepository;
	
	@SuppressWarnings("rawtypes")
	@RequestMapping("/health")
    public ResponseEntity getHealth() {
        return ResponseEntity.ok("System up");
    }
	// Find all cars
    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Car> list() {
    	return carRepository.findAll();
    }
    // Add new car
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Car create(@RequestBody Car car) {
    	return carRepository.saveAndFlush(car);
    }
    // Find one car
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Car get(@PathVariable Long id) {
    	return carRepository.findOne(id);
    }
    // Update car
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Car update(@PathVariable Long id, @RequestBody Car car) {
    	Car existingCar = carRepository.findOne(id);
    	BeanUtils.copyProperties(car, existingCar);
    	return carRepository.saveAndFlush(existingCar);
    }
    // Delete car
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Car delete(@PathVariable Long id) {
    	Car existingCar = carRepository.findOne(id);
    	carRepository.delete(existingCar);
    	return existingCar;
    }
    // Find cars by manufacturer
    @RequestMapping(value= "/make/{make}", method = RequestMethod.GET)
    public List<Car> getCarsByManufacturerList(@PathVariable("make") String make){
		return carRepository.findByMake(make);
    }
    // Find cars by model
	@RequestMapping(value= "/model/{model}", method = RequestMethod.GET)
    public List<Car> getCarsByModelList(@PathVariable("model") String model){
		return carRepository.findByModel(model);
    }
	// Find cars between starting and ending year
	@RequestMapping(value= "/startingYear/{startingYear}/endingYear/{endingYear}", method = RequestMethod.GET)
    public List<Car> getCarsBetweenYearsList(@PathVariable("startingYear") Integer startingYear, @PathVariable("endingYear") Integer endingYear){
		return carRepository.findByYearBetween(startingYear, endingYear);
    }
 }

