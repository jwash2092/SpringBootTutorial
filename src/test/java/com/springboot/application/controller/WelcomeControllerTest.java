package com.springboot.application.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.springboot.application.controller.WelcomeController;

public class WelcomeControllerTest {
	private WelcomeController controller;
	
	@Before
	public void setUp() throws Exception {
		controller = new WelcomeController();
	}

	@Test
	public void testController() {
		assertNotNull(controller);
	}
	
	@Test
	public void testWelcomePage() {
		String expected = "Welcome to Spring Boot!";
		String actual = controller.welcomePage();
		assertEquals(expected, actual);
	}

}
