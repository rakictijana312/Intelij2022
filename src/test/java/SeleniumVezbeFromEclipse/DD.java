package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//We can select value from DD by using Select class
//We can select by: index/visible text/value
public class DD {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();  
        
        driver.get("https://demoqa.com/select-menu");   
        driver.manage().window().maximize();
  
 
//     // Create the object of the Select class
    
      Select se= new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
      
      //     Select the option using the visible text
      se.selectByVisibleText("Green");

	
	
	
	
	}}