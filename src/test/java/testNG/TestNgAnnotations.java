package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgAnnotations {
  
	WebDriver driver ;
	@BeforeMethod
	public void setUp()
	{
		 driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
	}
	
	@AfterMethod()
    public void closeBrowser()
    {
		driver.close();
    }
	
	@Test(priority = 1)
	public void test1() {
		
		WebElement e = driver.findElement(By.id("username"));
        e.sendKeys("Tes1Username");
        
		
	}

	@Test(priority = 2)
	public void hello() {
		
		WebElement e = driver.findElement(By.id("username"));
        e.sendKeys("Test2Username");
       
	}

}
