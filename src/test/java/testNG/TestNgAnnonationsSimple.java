package testNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnonationsSimple {
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("##This should be called once****");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("###This is after test, should be called once***");
	}
	@BeforeMethod
	public void setUP()
	{
		System.out.println("Before Test Conditions, open browser , dbconn, ");
	}
	
	@AfterMethod
	public void tearDown()
	{
		System.out.println("AFter test , driver closed");
	}
	
	@Test
	public void loginTest()
	{
		System.out.println("This is login test1");
	}
	
	@Test
	public void loginTest2()
	{
		System.out.println("This is login test2");
	}
	
	@Test
	public void loginTest3()
	{
		System.out.println("This is login test3");
	}

}
