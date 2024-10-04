package testNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNg3 {
	
	@BeforeSuite()
	public void setup1()
	{ 
		System.out.println("This is set up 1 BEFORE SUITE");
	}
	
	@BeforeClass()
	public void bfClass()
	{
		System.out.println("This is setup 2 BEFORE CLASS");
	}
	
	@BeforeTest()
	public void beforeTest()
	{
		System.out.println("This is setUp BEFORE TEST");
	}
	
	@BeforeMethod
	public void befMeth()
	{
		System.out.println("This is before  BEFORE METHOD");
	}
	
	
	@AfterSuite()
	public void setup11()
	{ 
		System.out.println("This is set up 1 AFTER SUITE");
	}
	
	@AfterClass()
	public void bfClass2()
	{
		System.out.println("This is setup 2 AFTER CLASS");
	}
	
	@AfterTest()
	public void AFterTest()
	{
		System.out.println("This is setUp AFTER TEST");
	}
	
	@AfterMethod
	public void afMeth()
	{
		System.out.println("This is before AFTER METHOD");
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

}
