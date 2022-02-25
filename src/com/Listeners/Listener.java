package com.Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener extends TestListenerAdapter {

	
	/*
	 * <Listeners> <Listener class-name = "Listeners.Listener" /> </Listeners>
	 */
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Testcase pass");
		
	}
	
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("Testcase fail");
		
	}
	
}
