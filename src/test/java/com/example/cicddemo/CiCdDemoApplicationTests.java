package com.example.cicddemo;

import com.example.cicddemo.services.WelcomeService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CiCdDemoApplicationTests {

	@Autowired
	WelcomeService welcomeService;
	@DisplayName("Test Spring @Autowired Integration")
	@Test
	void testGet() {
		assertEquals("Hello Mx Archana, Welcome to Vapasi!", welcomeService.getMessage("Archana"));
	}

}
