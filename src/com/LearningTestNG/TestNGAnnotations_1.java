package com.LearningTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAnnotations_1 {

	
	@BeforeClass
	public void beforeClass() {
		
		System.out.println("Initialize Selenium");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		
		System.out.println("Opening Chrome");
		
	}
	
	@Test
	public void test1() {
		
		System.out.println("Inside Test 1");
	}
	
	@Test
	public void test2() {
		
		System.out.println("Inside Test 2");
	}
	
	@AfterMethod
	public void afterMethod() {
		
		System.out.println("Closing Chrome");
		
	}
	
	@AfterClass
	public void afterClass() {
		
		System.out.println("Destory Selenium");
		
	}
	
	
	
	
	
	
	
}
