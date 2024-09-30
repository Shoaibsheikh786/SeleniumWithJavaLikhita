package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnchorTag {

	public static void main(String[] args) {
    //3 Anchor Tag <a>
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//webleemnt is anchor tag 
	//	driver.findElement(By.linkText("Create a Page")).click();
		
		driver.findElement(By.partialLinkText("Create a Pa")).click();
	}

}
