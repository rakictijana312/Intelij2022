package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//navigate to page
//maximize
//locate username and enter username
//locate password and enter password
//locate log in and click on login
//add any item to cart
//navigate back
//get title by using if conditions and check did you navigate to right or wrong page


public class Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    
	    driver.manage().window().maximize();
	    
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        
        Thread.sleep(2000);
        
        driver.findElement(By.id("login-button")).click();
        
        Thread.sleep(2000);
        
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        
        Thread.sleep(2000);
        
        driver.navigate().back();
        
        Thread.sleep(2000);
        
        
        //get Title
        String tilte=driver.getTitle();
        
     
        if(tilte.equalsIgnoreCase("Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs"))
        {
            System.out.println("you were naviagted to right page");
        }
        else
        {
            System.out.println("you were naviagted to wrong page");
        }

	    
	    

	}

}
