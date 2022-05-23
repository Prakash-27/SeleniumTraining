package com.TestNGBatchFiles;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SIgnUpTest_DependsOnMethods_and_AlwaysRunConcept {

	@Test(priority = 2)//1.priority is used to give the number to excecute first that test case 1,2,3 likewise
	public void signupviaEmail() {
		System.out.println("SignUp Via Email");
		Assert.assertEquals(1, 1);
	}
	
	@Test(priority = 3 , dependsOnMethods = "signupviaEmail")//1.dependsonmethod gives the command to excecute or not 
	//2.becasuse the previous test case is passed means then only below test case are going to run
	//3.If its not it won't run Atall 
	public void signupviaFacebook() {
		System.out.println("SignUp Via Facebook");
	}
	
	@Test(priority = 1 , dependsOnMethods = "signupviaFacebook" , alwaysRun = true ) // alwaysRun = true will run the method whether before methods are Skipped or Failed
	public void signupviaTwitter() {
		System.out.println("SignUp Via Twitter");
	}

	
	@Test(priority = 4 )
	public void StartCar() {
		
		System.out.println("Car is Started...");
		
	}

	@Test(dependsOnMethods = {"StartCar"})
	public void DriveCar() {
		
		System.out.println("Drive Car...");
		
	}
	
	@Test(dependsOnMethods = {"DriveCar"})
	public void StopCar() {
		
		System.out.println("Car is Stopped");
		
	}
	
	@Test(dependsOnMethods = {"DriveCar","StopCar"} , alwaysRun = true)
	public void Parkcar() {
		
		System.out.println("Car is Parked");
		
	}
	
	
	
	
	
	
}
