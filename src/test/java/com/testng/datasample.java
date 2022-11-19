package com.testng;

import org.testng.annotations.DataProvider;

public class datasample {
	
	@DataProvider(name = "datum")
	public Object[][] data() {
		return new Object[][]
				{
		{"user1","test1"},
		{"user1","test1"},
		{"user1","test1"},
		{"user1","test1"}
		
				};	
		
	}
}
