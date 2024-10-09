package nopcommerceTest;

import org.testng.annotations.Test;

import nopcommercePages.CurrentOpeningPage;

public class CurrenetOpeningTest extends BasicSetup{
	
	
   CurrentOpeningPage cop;
	
	@Test
	public void test1()
	{
		cop=new CurrentOpeningPage(driver);
		cop.sendDataInSerach("info");
				
	}

}
