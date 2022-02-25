package com.TestNGBatchFiles;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataFile {



	@DataProvider(name = "data")
	public Object [][] testData(Method m){
		
		 Object [][] obj = new Object [3][4];
		 if(m.getName().equals("registerUser")) {
			
		 obj[0][0] = "Rahul";
		 obj[0][1] = "Singh";
		 obj[0][2] = "test@gmail.com";
		 obj[0][3] = "123";
		 
		 obj[1][0] = "Ragu";
		 obj[1][1] = "Singh";
		 obj[1][2] = "test1@gmail.com";
		 obj[1][3] = "1234";
		 
		 obj[2][0] = "Rohan";
		 obj[2][1] = "Singh";
		 obj[2][2] = "test2@gmail.com";
		 obj[2][3] = "12345";
		 
		 }
		 
		 return obj ;
		 
	}
		 
		 @DataProvider(name = "logindata")
			public Object [][] loginData(Method m){
				 
			     Object [][] obj = new Object [3][2];
				 if(m.getName().equals("LoginUser")) {
					 
				 obj[0][0] = "test@gmail.com";
				 obj[0][1] = "123";
				 
				 obj[1][0] = "test1@gmail.com";
				 obj[1][1] = "1234";
				 
				 obj[2][0] = "test2@gmail.com";
				 obj[2][1] = "12345";
				 
				 }
				 
				 return obj;
		
	}

	
	
}
