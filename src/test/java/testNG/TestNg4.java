package testNG;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class TestNg4 {
	
	@BeforeGroups(groups="regression")
	public void bfGroups()
	{
		System.out.println("This is pre condtion for reg test");
	}
   
	@Test(groups="smoke")
	public void loginTest()
	{
		System.out.println("This is smoke Test");
	}
	
	@Test(groups="regression")
	public void loginTest2()
	{
		System.out.println("This is Regression Test");
	}

	
	
	@Test(groups="wip")
	public void loginTest3()
	{
		System.out.println("This is Wip Test");
	}
	
	@Test(groups="regression")
	public void loginTest4()
	{
		System.out.println("This is Regression Test 2");
	}

}
