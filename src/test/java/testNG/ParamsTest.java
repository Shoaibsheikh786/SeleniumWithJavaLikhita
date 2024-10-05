package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamsTest {
	
	@Test
	@Parameters({"browser"})
	public void test1(String val)
	{
		System.out.println("hello world"+val);
	}

}
