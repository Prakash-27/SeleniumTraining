package com.TestNGBatchFiles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SIgnUpTest {

	@Test(priority = 2)//1.priority is used to give the number to excecute first that test case 1,2,3 likewise
	public void signupviaEmail() {
		System.out.println("SignUp Via Email");
		Assert.assertEquals(1, 1);
	}
	
	@Test(dependsOnMethods = "signupviaEmail")//1.dependsonmethod gives the command to excecute or not 
	//2.becasuse the previous test case is passed means then only below test case are going to run
	//3.If its not it won't run Atall 
	public void signupviaFacebook() {
		System.out.println("SignUp Via Facebook");
	}
	
	@Test(priority = 1 , dependsOnMethods = "signupviaFacebook")
	public void signupviaTwitter() {
		System.out.println("SignUp Via Twitter");
	}
}
