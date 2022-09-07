package SeleniumVezbeFromEclipse;

import java.io.File;
import java.io.IOException;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenShoot {

//NE RADIII
	
	//In order to create this Screen shot we have to go to mvnrepository.com
	//Go to commons-io
	//go to Apache Commons IO
	//click on jar and download jar 2.80 and add to Eclips Project Libraty
	

		public static String url = "http://secure.smartbearsoftware.com/samples/TestComplete11/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete11%2fWebOrders%2fDefault.aspx";

	    public static void main(String[] args)  {
	        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.get(url);
	        WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
	        username.sendKeys("Tester", Keys.TAB);

	        WebElement password = driver.findElement(By.name("ctl00$MainContent$password"));
	        password.sendKeys("test", Keys.ENTER);

	        TakesScreenshot ts=(TakesScreenshot)driver;
	        File sourceFile = ts.getScreenshotAs(OutputType.FILE); //Screenshot is  taken
	        
	    
	        try {
		           FileUtils.copyFile(sourceFile, new File("screenshots/smartBear/adminLogin.png") );//najbitniji deo je ovaj path
		           //uvek jeU path foldera koji smo kreirali na pr :"screenshot/tijana/onda kako ce se dokument zvati i nakon toga .png
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
	        }        //uvek je path foldera koji smo kreirali na pr :"screenshot/tijana/onda kako ce se dokument zvati i nakon tog

	 
	
	}


