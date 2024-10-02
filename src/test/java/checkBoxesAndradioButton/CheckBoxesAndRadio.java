package checkBoxesAndradioButton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesAndRadio {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/radio-buttons");
		Thread.sleep(3000);
		
WebElement red=		driver.findElement(By.xpath("//input[@type='radio' and @value='red']"));
 System.out.println(red.isSelected());
	
 red.click();
 
 System.out.println(red.isSelected());
}

}
