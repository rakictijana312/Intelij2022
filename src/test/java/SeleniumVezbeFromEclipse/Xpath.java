package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


//How to find xpath? //a[@id='idcta-link'] CTRL+f and text xpath "//span[text()='Register now']"
// Run bbc page
//Maximize
//Click on sign in
//Click on register
//Click on 16 and over
//Enter day
//Enter month
//Enter year
//Click continue
//Enter username
//Enter password
//Click on register


public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
	    driver.manage().window().maximize();

		Thread.sleep(2000);
		
		// driver.findElement(By.xpath("//*[@id=\"orb-header\"]/div/nav[2]/ul/li[3]/a")).click(); //Click on sport, nisam mogla da nadjem XPAth 
		//pa sam ga prekopirala
		//	Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@id='idcta-link']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Register now']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='16 or over']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='dateOfBirthDay']")).sendKeys("13");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='dateOfBirthMonth']")).sendKeys("7");
	
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='dateOfBirthYear']")).sendKeys("1986");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='sb-button sb-button--full-width']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-identifier-input']")).sendKeys("moazzamsadiq4@gmail.com");
		
		Thread.sleep(2000);
		
     	driver.findElement(By.xpath("//input[@id='password-input']")).sendKeys("QWErt2323");
     	
    	Thread.sleep(2000);
    	
		driver.findElement(By.xpath("//button[@id='submit-button']")).click();
		
		
		
		

	}

}
