package SeleniumVezbeFromEclipse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	 public static void main(String[] args) {
		 
		 
	 
	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get("http://syntaxtechs.com/selenium-practice/index.php");

	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        WebElement startPracticingButton= driver.findElement(By.id("btn_basic_exampl"));
	        startPracticingButton.click();

}

	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}