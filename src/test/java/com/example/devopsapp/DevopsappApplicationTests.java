package com.example.devopsapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsappApplicationTests {

	@Autowired
	private WelcomeController welcomeController;
	@Test
	void contextLoads(){

	}

}
