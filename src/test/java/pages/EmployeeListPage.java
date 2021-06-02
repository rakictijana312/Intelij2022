package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class EmployeeListPage extends CommonMethods {

    @FindBy(id="empsearch_id")
    public WebElement idEmployee;

    @FindBy(id="searchBtn")
    public WebElement searchButton;

    public EmployeeListPage(){
        PageFactory.initElements(driver, this);
    }
}
