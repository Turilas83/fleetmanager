package fi.eatech.fleetmanagerws.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonFormat;

import fi.eatech.fleetmanagerws.model.Car;

@JsonFormat(pattern="yyyy-MM-dd")

public class FleetStub {
	private static Map<Long, Car> cars = new HashMap<Long, Car>();
	private static Long idIndex = 3L;

	//Luodaan autoja
	static {
		Car a = new Car(1L, "make4", "model17", "MMQ-050", 2003, LocalDate.of(2018, 2, 3), 2111, 124);
		cars.put(1L, a);
		Car b = new Car(2L, "make5", "model7", "MMB-150", 2013, LocalDate.of(2017, 11, 5), 1423, 71);
		cars.put(2L, b);
		Car c = new Car(3L, "make8", "model6", "XHG-088", 2006, LocalDate.of(2017, 3, 4), 2284, 496);
		cars.put(3L, c);
	}

	public static List<Car> list() {
		return new ArrayList<Car>(cars.values());
	}

	public static Car create(Car car) {
		idIndex += idIndex;
		car.setId(idIndex);
		cars.put(idIndex, car);
		return car;
	}

	public static Car get(Long id) {
		return cars.get(id);
	}

	public static Car update(Long id, Car car) {
		cars.put(id, car);
		return car;
	}

	public static Car delete(Long id) {
		return cars.remove(id);
	}
}