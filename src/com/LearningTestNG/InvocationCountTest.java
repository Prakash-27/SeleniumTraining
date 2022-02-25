package com.LearningTestNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
	
	@Test(invocationCount = 10)// If Interviewer asked to Print value Multiple Times means --> we have to say @Test(invocationCount = 3) This one word can call the Function Three Times. 
	public void sum() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("sum is ====" + c);
	}
	
	
	
	
	
	
	

}
