package SeleniumVezbeFromEclipse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableSelectedCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    
	    //CHECKBOX ENABLE
	    WebElement redCheckBox= driver.findElement(By.xpath("//input[@value='red']"));
	    boolean redCheckBoxIsEnable= redCheckBox.isEnabled();
	    System.out.println("Red Check box is enable: " + redCheckBoxIsEnable);
	    
	    
	    
	    //CHECKBOX SELECTED
	    boolean redCheckBoxisSelected=  redCheckBox.isSelected();
	    		System.out.println("Red check box : " + redCheckBoxisSelected);
	    		
		

	}

}
