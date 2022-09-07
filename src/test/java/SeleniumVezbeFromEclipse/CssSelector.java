package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.get("https://www.bbc.com/");
    driver.manage().window().maximize();
    
   
    driver.findElement(By.cssSelector("span[id='idcta-username']")).click();
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("input[type='email']")).sendKeys("tijana@yahoo.com");
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Tijana2265/kkkk");
    
    Thread.sleep(2000);
    
    driver.findElement(By.cssSelector("button[type='submit']")).click();
    
   System.out.println();
    



}}
