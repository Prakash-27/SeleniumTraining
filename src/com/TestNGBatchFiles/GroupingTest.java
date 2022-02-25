package com.TestNGBatchFiles;

import org.testng.annotations.Test;

public class GroupingTest {

	@Test(groups= {"Performance"})
	public void feature1() {
		System.out.println("Inside features 1");
	}
	
	
	@Test(groups= {"regression"})
	public void feature2() {
		System.out.println("Inside features 2");
	}
	
	
	@Test(groups= {"Performance", "regression"})
	public void feature3() {
		System.out.println("Inside features 3");
	}
	
}
