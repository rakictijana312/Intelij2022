package SeleniumVezbeFromEclipse;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
		driver.get("https://www.bbc.com/");
	    driver.manage().window().maximize();
	    
	    String title= driver.getTitle();
	   
	    if(title.equalsIgnoreCase("bbc")) {
	    System.out.println("Title is right");
	    
	    }else{
	    	System.out.println("Title is wrong");
	    	
	    	
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
