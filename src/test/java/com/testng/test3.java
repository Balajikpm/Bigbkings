package com.testng;

import org.testng.annotations.Test;

public class test3 {
	

		@Test(groups= "regression")

		private void tc1000() {
			
		System.out.println("test1000..."+Thread.currentThread().getId());
		}
		@Test(groups= "smoke")
		private void tc2000() {
			
		System.out.println("test2000..."+Thread.currentThread().getId());
		}
		@Test(groups= "sanity")
		private void tc3000() {
			
		System.out.println("test3000..."+Thread.currentThread().getId());
		}

}
