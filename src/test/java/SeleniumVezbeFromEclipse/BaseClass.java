package SeleniumVezbeFromEclipse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;

    //this method will open browser
    public static void setUpWithSpecificUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      ChromeDriver WebDriver = new ChromeDriver();
      driver.get(url);
        //  driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

    }
    //this method will quit browser
    public static void tearDown(){
        if(driver!=null){
            driver.quit();
        }

    }}
