package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	
	public  static void main(String[] args) {

        String url = ("https://the-internet.herokuapp.com/");
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

    WebElement fileUploadLink=driver.findElement(By.linkText("File Upload"));
    fileUploadLink.click();

    WebElement chooseFile=driver.findElement(By.id("file-upload"));
    chooseFile.sendKeys("C:\\Users\\rakic\\Desktop\\userData.xlsx");

    WebElement uploadBAutton=driver.findElement(By.id("file-submit"));
    uploadBAutton.click();
	}

}
