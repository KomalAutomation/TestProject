package com.github.api;

import org.testng.annotations.DataProvider;

public class DataForTests {
	
	
	@DataProvider(name="DataForPost")
	public static Object[][] dataForPost() {

		
		return new Object[][] {

			{"repoTest1",false},
			{"repoTest2",false}
		};	

	}

}
