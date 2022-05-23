package com.LearningTestNG;

import org.testng.annotations.Test;

public class Priority_And_EnabledConcept {

	
	@Test(priority = 1)
	public void TestOne() {
		
		System.out.println("This is Test1");
		
	}
	
	@Test(priority = 2)
	public void TestTwo() {
		
		System.out.println("This is Test2");
		
	}
	
	@Test(priority = 3)
	public void TestThree() {
		
		System.out.println("This is Test3");
		
	}
	
	@Test(priority = 4 , enabled = false) //When we put enabled = false that test method will not participate in TestNG Running Test Cases
	public void TestFour() {
		
		System.out.println("This is Test4");
		
	}
	
	
	
	
	
	
}
