package com.LearningTestNG;

import org.testng.annotations.Test;

public class ExpectedException {

	@Test(expectedExceptions = NumberFormatException.class)
	public void test1() {
		String x = "100A";
		Integer.parseInt(x);
	}
	
	
	/*
	 * @Test(invocationTimeOut = 1) public void infiniteloop() { int i = 1; while(i
	 * == 1) { System.out.println(i); } }
	 */
	 
	
	
	
}
