package windowHandlesss;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinHin {

	public static void main(String[] args) throws InterruptedException {
   
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows");
		
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		
		//getWindowHandle;
		
	String cWin=	driver.getWindowHandle();
	
	System.out.println(cWin);
	
	//All the windows
    Set<String> allWinid=driver.getWindowHandles();
    
   Iterator<String> it= allWinid.iterator();
   
     String win1=   it.next();
     String win2=  it.next();
     
     driver.switchTo().window(win2);
     System.out.println(driver.getTitle());
     
     Thread.sleep(2000);
     
     driver.close();
     
     Thread.sleep(2000);
     
     driver.switchTo().window(win1);
     
     
     
     
     
		
	}

}
