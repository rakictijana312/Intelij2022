package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
// NIJE TACNOOOOO
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://duckduckgo.com/");

		WebElement searchTextBox= driver.findElement(By.id("search_form_input_homepage"));

		// retrieving html attribute value using getAttribute() method
		String typeValue=searchTextBox.getAttribute("type");
		System.out.println("Value of type attribute: "+typeValue);
		

	}

}
