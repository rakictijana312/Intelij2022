package SeleniumVezbeFromEclipse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//start amazon page
//maximize page
//maximize full screen - kad je full page ne vidimo url dok ne kliknemo na esc
//navigate back
//navigate forward
//navigate refresh
//get title
//get Current url
//close page
//close whole browser
public class StartSelenium {

	 public static void main(String[] args) throws InterruptedException {

        

	            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            driver.get("https://www.amazon.com/");
	            driver.manage().window().maximize();
	         // driver.manage().window().fullscreen();
	            Thread.sleep(2000); // will throw Interrupted Exception
	            driver.navigate().back();
	            Thread.sleep(2000);
	            driver.navigate().forward();
	            Thread.sleep(2000);
	            driver.navigate().refresh();
	            Thread.sleep(2000);
	            driver.navigate().refresh();
	            Thread.sleep(2000);
	            
	            String title = driver.getTitle();
	            String url = driver.getCurrentUrl();
	            System.out.println(url + " " + title);
	         
	          //driver.close();
	            driver.quit();
	            
	         
	            

	}

}
