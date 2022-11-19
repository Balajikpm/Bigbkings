package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class test1 {

@Test(groups= "regression")

private void tc1() {
	
System.out.println("test1...");
}
@Test(groups= "smoke")
private void tc2() {
	
System.out.println("test2..."+Thread.currentThread().getId());
}
@Test(groups= "sanity")
private void tc3() {
	
System.out.println("test3..."+Thread.currentThread().getId());
}

}
