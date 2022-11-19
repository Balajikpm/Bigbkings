package com.testng;

import org.testng.annotations.Test;

public class test2 {
	

		@Test(groups= "smoke")

		private void tc100() {
			
		System.out.println("test100..."+Thread.currentThread().getId());
		}
		@Test(groups= "regression")
		private void tc200() {
			
		System.out.println("test200..."+Thread.currentThread().getId());
		}
		@Test(groups= "regression")
		private void tc300() {
			
		System.out.println("test300..."+Thread.currentThread().getId());
		}
}

