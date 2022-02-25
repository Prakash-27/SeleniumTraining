package com.LearningTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations_2 {
	
                                                        //@BeforeSuite
	                                                      //@BeforeTest 
	                                                        //@BeforeClass
	                                                          //@BeforeMethod
	                                                           //@Test1,2,3
	                                                    //@AfterMethod
	                                                 //@AfterClass
	                                              //@AfterTest
	                                           //@AfterSuite
	
	@BeforeSuite                                                    
	public void beforeSuite() {
		
		System.out.println("Starting TESTNG ");

	}
	
	@AfterSuite
	public void afterSuite() {
		
		System.out.println("Stoping TESTNG ");

	}
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("Start Test Execution ");

	}
	
	@Test
	public void test3() {
		
		System.out.println("Inside Test 3 ");
	}
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("Stop Test Execution ");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
