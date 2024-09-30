package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagNamee {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//Weblements[s]
		
		Thread.sleep(2000);
	List<WebElement> li=driver.findElements(By.tagName("a"));
	
	System.out.println(li.size());
		
	//	System.out.println("hello world");
	//	Thread.sleep(4000);
		
	//	System.out.println("hello java");
	
	}

}
