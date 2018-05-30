package fi.eatech.fleetmanagerws.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fi.eatech.fleetmanagerws.model.Car;

@RequestMapping("/fleet")
@RestController
public class FleetController {

	
    @SuppressWarnings("rawtypes")
	@GetMapping("/health")
    public ResponseEntity getHealth() {
        return ResponseEntity.ok("System up");
    }
    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public List<Car> list() {
    	return FleetStub.list();
    }
    @RequestMapping(value = "cars/{id}", method = RequestMethod.POST)
    public Car create(@RequestBody Car car) {
    	return FleetStub.create(car);
    }
    @RequestMapping(value = "cars/{id}", method = RequestMethod.GET)
    public Car get(@PathVariable Long id) {
    	return FleetStub.get(id);
    }
    @RequestMapping(value = "cars/{id}", method = RequestMethod.PUT)
    public Car update(@PathVariable Long id, @RequestBody Car car) {
    	return FleetStub.update(id, car);
    }
    @RequestMapping(value = "cars/{id}", method = RequestMethod.DELETE)
    public Car delete(@PathVariable Long id) {
    	return FleetStub.delete(id);
    }
 }

