package framess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramess {

	public static void main(String[] args) {
      WebDriver driver=new ChromeDriver();
      driver.get("https://practice.expandtesting.com/iframe");
      
      //Value of this line ---> 
      //Becasue the element which are searching for is in the 
      // frame ---> iframe 
      driver.switchTo().frame("mce_0_ifr");
      
 WebElement input=     driver.findElement(By.xpath("//body[@id='tinymce']/p"));
 input.clear();
 input.sendKeys("Hello World ***********");
 
 driver.switchTo().parentFrame();
	}

}
