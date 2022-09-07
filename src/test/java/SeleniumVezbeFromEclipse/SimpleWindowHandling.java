package SeleniumVezbeFromEclipse;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleWindowHandling {
	
	 public static void main(String[] args) throws InterruptedException {
	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://accounts.google.com/signup");

/*	        //getting current window handle
	        String mainPageHandle=driver.getWindowHandle();
	        System.out.println(mainPageHandle);
	        WebElement helpLink=driver.findElement(By.linkText("Help"));
	        helpLink.click();
	        
	        
	        
	        
	        */
	        //All windows handles
	        Set<String> allWindowHandles= driver.getWindowHandles();//will automaticly return LinkedHashSet____THIS WILL BE INTERVIEW QUESTION?
	        System.out.println(allWindowHandles.size());
	        Iterator<String> it=allWindowHandles.iterator();
	        String mainPageHandle = it.next();//steping forward and getting main page
	        String childHandle = it.next();//steping forward again and getting child page
	        System.out.println(childHandle);
	        Thread.sleep(2000);
	        driver.switchTo().window(mainPageHandle);//swiching back to parent window
	      //  driver.close();
	        driver.quit();


	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        

}
}