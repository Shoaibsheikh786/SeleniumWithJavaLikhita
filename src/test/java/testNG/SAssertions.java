package testNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SAssertions {

	
	@Test
	public void assertion1()
	{    
		//1. SoftAssert object
		
		SoftAssert sa=new SoftAssert();
		System.out.println("hello world ");
		//Assert.assertTrue(false);   //passed 
		sa.assertTrue(false);        //falid
		System.out.println("helo world 2");
		
		
		sa.assertAll();  // to report , 
	}
}
