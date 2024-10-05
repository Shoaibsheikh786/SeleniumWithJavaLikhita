package testNG;


import org.testng.Assert;
import org.testng.annotations.Test;


public class ListernerTest {
	
	@Test
	public void test1()
	{
		System.out.println("login test");
		Assert.assertTrue(true);
	}
	
	@Test
	public void test2()
	{
		System.out.println("login test");
		Assert.assertTrue(false);
	}
	
	@Test
	public void test3()
	{
		System.out.println("login test");
		Assert.assertTrue(false);
	}

}
