package SeleniumVezbeFromEclipse;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {  public static String url="http://www.uitestpractice.com/Students/Switchto";



public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get(url);
   driver.manage().window().maximize();
   
   
/*  Simple alert
    WebElement simpleAlertButton= driver.findElement(By.id("alert"));//locate alert
    simpleAlertButton.click();
    Thread.sleep(2000);
   
   Alert simpleAlert= driver.switchTo().alert();//swich to pop up alert
   simpleAlert.accept();
 
   handling confirmation alert
   WebElement confirmButton= driver.findElement(By.id("confirm"));
   confirmButton.click();
   Thread.sleep(2000);
  
   Alert confirmAlert=driver.switchTo().alert();
   String alertAText= confirmAlert.getText();
   System.out.println(alertAText);
   confirmAlert.dismiss();
	
   */
   
  // handling promt alert
   WebElement promptAlertButton=driver.findElement(By.id("prompt"));
   promptAlertButton.click();
   Thread.sleep(2000);
   Alert promtAlert= driver.switchTo().alert();
   promtAlert.sendKeys("Syntax teach");
   promtAlert.accept();
	

}
}