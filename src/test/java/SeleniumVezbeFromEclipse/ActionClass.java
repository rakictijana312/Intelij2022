package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.ebay.com/");
	    
	    
  //right click
     WebElement dailyDeals= driver.findElement(By.xpath("//a[text()=' Daily Deals']"));
     Actions action=new Actions(driver);
     action.contextClick(dailyDeals).perform();
    
     
     //double click
   // action.doubleClick(dailyDeals).perform();
	    
	    
	    
	}

}
