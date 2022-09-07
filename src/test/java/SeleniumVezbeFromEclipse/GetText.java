package SeleniumVezbeFromEclipse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("http://www.uitestpractice.com/Students/Contact");
	    driver.manage().window().maximize();
	    
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//a[text()='This is a Ajax link']")).click();
	    
	    
	 
	    
	    WebElement text = driver.findElement(By.xpath("//div[@class='ContactUs']"));
        String textBlock=text.getText();
        System.out.println(textBlock);
	}

}