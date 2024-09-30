package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindName {

	public static void main(String[] args) {
   
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		//2. By name attribute 
		driver.findElement(By.name("email")).sendKeys("helo@fb.com");
	}

}
