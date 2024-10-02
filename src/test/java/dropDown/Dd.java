package dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dd {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/dropdown");
		
WebElement ele=		driver.findElement(By.xpath("//select[@id='country']"));
	
	//select Tag
    // --> Select class 

  Select dd=new Select(ele);
  
  //3 methods to use 
  
  //1. By index
   //  dd.selectByIndex(1);
  
  //2. By visible text
 // dd.selectByVisibleText("India");
  
  //3 .select by value 
  dd.selectByValue("BE");
  
 
	
}

}
