package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//  Click on single box

public class CheckBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	   
	    driver.findElement(By.xpath("//input[@value='red']")).click();
	    
	    
	  
	    		

	}

}
