package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExicutor {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(2000);
	    
//	    //input kay without JSE by using SENDKEYS
//	    WebElement email=driver.findElement(By.id("email"));
//	    email.sendKeys("kffkfdkf");
	    
	    //open new tab
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.open();");
//        WebElement search = driver.findElement(By.name("q"));
//        search.sendKeys("dfsfsf");


	    //Scroll Up- meni scroluje down
	    //JavascriptExecutor js=(JavascriptExecutor)driver;
	    //js.executeScript("window.scrollBy(0,250)");
	    
	    
	    //Scroll Down- meni scroluje up
	   // JavascriptExecutor js=(JavascriptExecutor)driver;
	   // js.executeScript("window.scrollBy(0,250)");
	 
	    
	     //highlight password element
        //JavascriptExecutor js= (JavascriptExecutor) driver;
       //js.executeScript("arguments[0].style.backgroundColor='red'", pass);
	    
	    
	    /*Da bi koristili highlight element moramo da koristimo
	     stranicu gde moramo da unesemo user name and password kao u sledecem primeru dole
	     
	     
	    String url = ("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       
        driver.get(url);
        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Admin");

        WebElement pass=driver.findElement(By.id("txtPassword"));
        pass.sendKeys("Hum@nhrm123");

        WebElement logIn =driver.findElement(By.id("btnLogin"));
	     
	     
	     */
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
