package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	
	@Test(dataProvider="userData")
   public void loginWithInvlidCred(String u,String p)
   {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
	WebElement user=	driver.findElement(By.id("username"));
	WebElement pass=	driver.findElement(By.id("password"));
	
	user.sendKeys(u);
	pass.sendKeys(p);
	WebElement btn= driver.findElement(By.xpath("//button[text()='Login']"));
	driver.close();
	  
   }
	
	@DataProvider()
	public String[][] userData()
	{
		//you can get data from excle
		
		String data[][]= {
				{"user1","pass1"},
				{"user2","pass2"},
				{"user3","pass3"},
				
		};
		
		return data;
				
	}
}
