package com.springboot.application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ApplicationSpringBootTest {
	private ApplicationSpringBoot app;

	@Before
	public void setUp() throws Exception {
		app = new ApplicationSpringBoot();
	}

	@Test
	public void test() {
		assertNotNull(app);
	}

}
