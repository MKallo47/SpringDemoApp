package com.galvanize.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void returnNumberShouldReturnOne(){
		int num = 1;
		int num2 = DemoApplication.returnNumber();
		assertTrue((num==num2));
	}

}
