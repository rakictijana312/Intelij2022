package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDD {

	public static void main(String[] args) {
	
		
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();  
        
        driver.get("https://demoqa.com/select-menu");   
        driver.manage().window().maximize();
        
        Select listbox=new Select(driver.findElement(By.xpath("//select[@id='cars']")));
        if(listbox.isMultiple()){
        	 listbox.selectByVisibleText("Volvo");
        	 listbox.selectByVisibleText("Opel");
        	 
        }
       
	}


}