package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xapths {

	public static void main(String[] args) {
    
	//xpath with attribute //tagname[@nameOfAttribute='Value']
		//input[@type='text']
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Xpath with attribute
	//	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("hello");
		
		//xpath with methods ()
		driver.findElement(By.xpath("//button[text()='Log in']")).sendKeys("hello");
		
		////button[contains(@name,'login')]
		
		//button[starts-with(@name,'gin')]
		
		//th[@id='dis']/preceding-sibling::th[2]  /following
		
		////tbody/descendant::td[text()='Chrome']
		
		
		
		
		
	}

}
