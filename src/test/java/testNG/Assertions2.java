package testNG;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Assertions2 {
	
	@Test
	public void assertion1()
	{
		System.out.println("hello world ");
		Assert.assertTrue(false);   //passed 
		System.out.println("helo world 2");
	}

}
