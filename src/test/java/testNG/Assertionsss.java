package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionsss {
	
	
	/*Title :---> Test Login Page for Automation Testing Practice*/
	/*Title : ---> Secure Page page for Automation Testing Practice*/
	@Test
	public void loginWithValidCred()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
	WebElement u=	driver.findElement(By.id("username"));
	WebElement p=	driver.findElement(By.id("password"));
	u.sendKeys("practice");
	p.sendKeys("SuperSecretPassword!");
	WebElement btn= driver.findElement(By.xpath("//button[text()='Login']"));
	btn.click();
//	String exp="Secure Page page for Automation Testing Practice";
//	String actTitle= driver.getTitle();
//	Assert.assertEquals(actTitle,exp);
	
	String s=   driver.findElement(By.xpath("//div[@id='flash']/b")).getText();
	   Assert.assertEquals(s, "You logged into a secure area!");
	}
	
	@Test()
	public void loginWithInValidCred()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
	WebElement u=	driver.findElement(By.id("username"));
	WebElement p=	driver.findElement(By.id("password"));
	u.sendKeys("adfakl");
	p.sendKeys("Wormd");
	WebElement btn= driver.findElement(By.xpath("//button[text()='Login']"));
	btn.click();
	String s=   driver.findElement(By.xpath("//div[@id='flash']/b")).getText();
	   Assert.assertEquals(s, "You logged into a secure area!");
	}

}
