package com.TestNGBatchFiles;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;


public class LoginTest {
	
	
	@Test
	public void loginviaEmail() {
		System.out.println("Login Via Email");
		
		// 1.Here we are using try catch block to handle the the negative(failed) test to pass the test
		
		//this line has selenium1 and selenium2 both 
		//are not equals it gives failed test using try catch block to resolve the case to run has pass
		try {
			Assert.assertEquals( "Selenium1" , "Selenium2");
		}
		catch(Throwable t) {
			
			System.out.println(t);
		}
		
		System.out.println("After assert condition");
		//Assert.assertEquals(1, 1);
	    //Assert.assertTrue(4>1);
		//Assert.assertTrue(1<4); 
		//Assert.assertFalse(1<4); 
		//Assert.assertFalse(4<1);
	}

	@Test
	public void loginviaFacbook() {
		System.out.println("Login Via Facebook");
		//TO Skip the Test we are using this exception
		//throw new SkipException("Facebook functionality is not supported");
	}
	
	
	@Test
	public void loginviaTwitter() {
		System.out.println("Login Via Twitter");
		
	}
}
