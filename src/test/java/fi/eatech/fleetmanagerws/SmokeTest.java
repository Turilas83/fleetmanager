package fi.eatech.fleetmanagerws;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import fi.eatech.fleetmanagerws.controller.FleetController;

// Test that controller is created by the context
@RunWith(SpringRunner.class)
@SpringBootTest
public class SmokeTest {
	
	@Autowired
	private FleetController controller;
	
	@Test
	public void contextLoads() throws Exception {
		assertThat(controller).isNotNull();
	}

}
