package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
	
	//URL NE RAdi
	public static String url = "http://syntaxtechs.com/selenium-practice/dynamic-data-loading-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();

        WebElement getNewUserButton=driver.findElement(By.id("save"));
        getNewUserButton.click();

        WebDriverWait wait=  new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name :')]")));

        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name :')]"));
        System.out.println(firstName.getText());

	
}
}