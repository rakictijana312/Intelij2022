package SeleniumVezbeFromEclipse;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


//by using driverFind ELEMENTSSSS
//CheckBoxes size by using list<WebElement>

public class CheckBoxes {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.ironspider.ca/forms/checkradio.htm");
	    
	    		
	    		
	   List<WebElement> checkBoxes= driver.findElements(By.xpath("//input[@type='checkbox']"));// nije bitno da je xpath unique

	   System.out.println("Number of boxes is : " + checkBoxes.size()); //6
	   
	   
	   
	   for(WebElement checkBox:checkBoxes) {
		   String checkBoxvalue= checkBox.getAttribute("value");
		   System.out.println(checkBoxvalue);
		   if (checkBoxvalue.equalsIgnoreCase("yellow")) {
               checkBox.click();
		   }
               if (checkBoxvalue.equalsIgnoreCase("red")) {
            	   checkBox.click();
               }
               
               if (checkBoxvalue.equalsIgnoreCase("green")) {
            	   checkBox.click();
            	   break;
	   }
	}

}}
