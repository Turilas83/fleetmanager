package fi.eatech.fleetmanagerws;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

import fi.eatech.fleetmanagerws.controller.FleetController;
import fi.eatech.fleetmanagerws.model.Car;
import fi.eatech.fleetmanagerws.repository.CarRepository;

public class FleetControllerTest {
	
	// Making mock instance of FleetController
	@InjectMocks
	private FleetController fc;
	
	// Mock repository to avoid NullPointerException
	@Mock
	private CarRepository carRepository;
	
	// Wrapping mocks together
	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
	}
	// Test getting car
	@Test
	public void testCarGet() {
		Car c = new Car();
		c.setId(1l);
		when(carRepository.findOne(1l)).thenReturn(c);
		
		Car testCar = fc.get(1L);
		
		verify(carRepository).findOne(1l);
		
		assertEquals(1L, testCar.getId().longValue());
	}
}
