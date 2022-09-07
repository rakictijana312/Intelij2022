package JavaTeorija;

public class SeleniumReview2021 {
    /*
    package MyREVIEW;

public class SeleniumReview2021 {

    Selenium is set of tools that we are using to automate web applications, its manually used to preform

    functional testing.

    Advantages of using Selenium:
      ● It is an Open source suite of tools mainly used for Functional and Regression
        Test Automation.

      ● Selenium supports various Operating environments:
      MS Windows,Linux,Macintosh etc...

      ● Selenium supports various Browsers:
      Mozilla Firefox,IE,Google Chrome,Safari,Opera etc...

      ● Selenium supports various programming environments to write programs (Test
      scripts):
      Java,C#,Python,Perl,Ruby,PHP, JS

      Selenium and QTP are most commonly used tools in selenium

      Disadvantage of using Selenium:
      ● Automating Captcha is not possible
      ● We can not read barcode using Selenium WebDriver
      ● Windows based pop ups
      ● Image validation and comparison
      ● PDF validation and comparison

      Selenium components:
      Selenium IDE Selenium IDE (Integrated Development Environment) is a Firefox plugin.

      Selenium RC AKA Selenium Remote control / Selenium 1.

      Selenium WebDriver AKA Selenium 2 is a browser automation framework that accepts
      commands and sends them to a browser. It is implemented through a browser-specific
      driver. It controls the browser by directly communicating with it.
      Selenium WebDriver is an interface, its open source automation tool which allows us to preform actions on web page.

      Selenium Grid is a tool used to distribute your test execution on multiple platforms and
      environments concurrently.
      Usage or Advantage of Selenium Grid:
      ● It allows running test cases in parallel thereby saving test execution time.
      ● It allows multi-browser testing
      ● It allows us to execute test cases on multi-platform

       We are using the Selenium 3.0 because of compatibility issues which can support most of
       the latest browsers any way we are creating maven project any dependency we can easily
       update in pom.xml file.

       When we go for automation?
       - When manuel test passed
       - When environment is stable
       - Analyze our test suite and choose our automation tools.

       Level of testing?
       - Unit testing
       - System testing
       - Acceptance testing

       Types of software testing?
       1) Functional ( smoke, regression, sanity check)
       2) Non functional ( performance, security testing)


       What is the super interface of WebDriver?
       The Super interface of WebDriver is SearchContext Interface.

       What is a headless browser?
       HTMLUnitDriver, because it is headless browser which have less User Interface

       What are the Locators available in Selenium? Which locator do you prefer?
       There are 8 locators in selenium to identify the webelements on the webpage : ID,
       ClassName, Name, TagName, LinkText, PartialLinkText, XPath, CSS Selector.
       I prefer ID or xpath


       What is an XPath?
       XPath is used to locate the elements. Using XPath, we could navigate through elements
       and attributes in an XML document to locate web elements.

      What is the difference between Absolute Path and Relative
      Path? What is the difference between “/” and “//”? In which situations are you
      going to use Xpath?

      ● Single Slash “/” – Single slash is used to create XPath with absolute path and its always start from starting node
      of HTML
      Example : /html/body/td/tr/div[1]/div[2]

      ● Double Slash “//” – Double slash is used to create XPath with relative path and can start from any node of document
      Example: //input[@id=’username’]

      Write a complex xpath or css expression? Which one is better? What is the difference?

      xpath:
      "//label[@for='personal_txtLicExpDate']/following-sibling::img"

      css:
      "input[name^='pass']"

     Both CSS and XPATH are great in Selenium Automation

     ● Difference between both Xpath and CSS:
       Speed wise, when we want to automate the test Case on Internet Explorer sometimes CssSelector is
       better and for the rest (Browser i.e. Firefox, Chrome and Safari) xpath is better
     ● Generally CSS is easy to use and readable over XPATH.
     ● CSS works only in forward direction while with xpath, we can search elements backward or forward
     ● Xpath can work with text while CSS cannot


     Why we need so many locators?
     - Some locators might have duplicate values
     - Developers might not provide all locators for the same element
     - Some locators might be not applicable to all elements.

     ex: LINKTEXT/PARTIALLINKTEXT ARE ONLY FOR LINKS


     How to launch a browser using Selenium WebDriver? Explain the line of code

     // set the property for chrome driver, specify its location via the webdriver.chrome.driver
     System.setProperty("webdriver.chrome.driver", driverPath+"chromedriver.exe");
z
     // instantiate an instance of ChromeDriver, which will be driving our browser:
     public static WebDriver driver = new ChromeDriver();

     // navigate to the specific url
     driver.get("http://google.com");

      close () vs quit:
       - close will close current tab
       - quit will quit all browser

       navigate vs get?
       - get will wait for whole page to load vs navigate will not
       - get will keep history of your browser vs navigate will not
       - navigate will move back, forward, refresh.

       driver.navigate().to("http://www.example.com");
       driver.navigate().forward();
       driver.navigate().back();

       What is WebElement?
       Anything you see on web page is consider as web element.

       What is HTML? HyperText Markup Language

       HTML script meaning:
       purple - tags
       brown/orange - attributes
       blue -  attributes value
       Those 3 we will only follow and they are the most important.

       "a" tag in HTML is called anchor tag

       If 2 or more elements have same attributes and attributes values selenium will only see the first one and
       will only interact with first element.

       <div> -- division
       <img> -- images
       <h>   -- header
       <p>   -- paragraph
       <li>  -- list
       <ul>  -- unordered list
       <ol>  -- ordered list


       What is DOM?
       DOME stands for Document Object Module.It is browser's internal view of webpage. Also its called DEVELOPER TOOL
       Document - can be stored any document, like PDF/WORD
       Object - any line HTML is called object,
       Module - its just layout of the HTML file in DOM.

       How to get the text of a web element? How to get an attribute value using Selenium
       WebDriver?
       String buttonText = driver.findElement(By.cssSelector("div.success")).getText();
       String innerText = driver.findElement(By.cssSelector("div.success")).getAttribute("type");


        What is the difference between driver.findElement() and driver.findElements()
       commands? What is the return type of findElements?

       findElement() will return only a single WebElement and if that element is not located or
       we use some wrong selector then it will throw NoSuchElementexception.

       findElements() will return List of WebElements – It returns an empty list, when
       element is not found. It doesn't throws NoSuchElementException


       How do you work with radio buttons/same checkboxes which do not have an id attribute?
       We can use click() ,if “id” is not present we can use xpath(i.e you can use relative or
       absolute) ,css or other locator type.

       Also when there is a group of Radio Buttons/Check Boxes on the page then, it is possible
       that their names are the same, but values are different. In that case we can use the
       Webdriver findElements command to get the list of web elements and then loop through them.

       List<WebElement> radioBtn=driver.findElements(By.name("sex"));
       for(WebElement radio: radioBtn) {
       String value=radio.getAttribute("value");
       if(radio.isEnabled() && value.equals("Female"))
       radio.click();
       break;
       }}

       How to select a value in a dropdown? How to check the multiple selected value in a
       dropdown?
       We can use Select class
       Select dropdown = new Select(driver.findElement(By.id("designation")));
       ● dropdown.selectByVisibleText("Value");
       ● dropdown.selectByIndex(1);
       ● dropdown.selectByValue("value");

       isMultiple() Method
       isMultiple() method is useful to verify if the targeted select box is multiple select box or
       not means we can select multiple options from that select box or not. It will return
       boolean (true or false) value. We can use it with if condition before working with select box
       Select listbox = new Select(driver.findElement(By.xpath("//select[@id='FromLB']")));
       if (listbox.isMultiple()){
              listbox.selectByVisibleText("Value");
              listbox.selectByVisibleText("Value");
}

       How do you handle an element in different windows? Getwindowhandle vs
       Getwindowhandles and the return types. Write a method to switch to the window
       based on title?

       We can handle multiple windows in selenium webdriver using Switch To methods which
       will allow us to switch control from one window to another window. When we open the
       browser window and then 3 tabs pop open, selenium is focused on the first window.

       getWindowHandle() will get the handle of the page the webDriver is currently
       controlling. Everytime Selenium opens a browser, it's going to give an index ID for the
       page called handle. This handle is a unique identifier for the web page. This is different
       every time you open a page even if it is the same URL.
       String handle= driver.getWindowHandle();

       getWindowHandles() method or commands returns all handles from all opened browsers by Selenium WebDriver during execution
       Set<String> handle= driver.getWindowHandles();//Return a set of window handle

       You can use SwitchTo().Window("handle") to switch to the window you desire.
       You can use SwitchTo().Window("mywindowID"), if you know the window ID.
       SwitchTo().Window("") will always go back to the base/main window.

       Method to switch to window based on title
       public switchToWindow(String titleName) {
          driver.switchTo().window("titleName"); //titleName =windowName

}
       How would you handle elements that are in a different frame? How to identify the frame which does not have Id as well as name?
       Using switch commands we can switch to different frame to handle elements:
       We can switch to the frame 3 different ways:
          1. Switch to Frame by Name or ID
          driver.switchTo().frame("iframe1")

          2. Switch to Frame by WebElement
          WebElement iframeElement = driver.findElement(By.id("IF1"));
          driver.switchTo().frame(iframeElement);

          3. Switch to Frames by Index
          driver.switchTo().frame(0)

       How can we handle web based pop-up? How can you handle JavaScript Alerts? Can
       we inspect an alert? How many ways can you handle alerts? How do you get text
       from alert? How do you send text to alert? How can we handle windows based pop up?

       We can handle web based pop-ups using Alert Interface.

       There are four methods that we would be using along with the Alert interface.
       Alert alert = driver.switchTo().alert();

       1) void dismiss() – The dismiss() method clicks on the “Cancel” button as soon as the pop up window appears.
       alert.dismiss(); or driver.switchTo().alert().dismiss();

       2) void accept() – The accept() method clicks on the “Ok” button as soon as the pop up window appears.
       alert.accept(); or driver.switchTo().alert().accept();

       3) String getText() – The getText() method returns the text displayed on the alert box.
       alert.getText(); or driver.switchTo().alert().getText();

       4) void sendKeys(String stringToSend) – The sendKeys() method enters the specified string pattern into the alert box.
       alert.sendkeys(“text”); or driver.switchTo().alert().sendkeys(“text”);
       How many ways can you handle alerts?

       //DODATO IS MOJIH SELENIUM NOTESSSS BITNOOO JEEE
       There are 4 methods in JavaScript that we will using along with alert interface:
       accept, dismiss, getText, sendKeys.

       How do you get text and send text to alert ?
       formula

       We have 3 types of alerts:
       WebBased or html alerts: we can simply inspect them and preform needed actions.

       Windows based alerts: we can not handle them with Selenium.

       Java script alerts ot browser alerts we can handle them by using method swithto() in selenium and we can not inspect them.
       We have:

       Simple alert- click on( accept and get text method can be used only)

       Prompt alert : enter text and click on it.

       Confirmation alert: we can cancel
       or click on ( all accept sendkey can be used)
       Selenium WebDriver cannot handle window based pop ups, for that we can use Robot Class or third-party tools like AutoIT.




       What are the types of waits available in Selenium WebDriver? What is Implicit/
       Explicit/ Fluent Wait In Selenium WebDriver?What is WebDriverWait In Selenium WebDriver?

       Implicit Wait
       The implicit wait will tell the web driver to wait for a certain amount of time before it
       throws a "No Such Element Exception".
       driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);

       Explicit Wait
       The explicit wait is used to tell the Web Driver to wait for certain conditions (Expected
       Conditions) or the maximum time exceeded before throwing "ElementNotVisibleException" exception.
       The explicit wait is an intelligent kind of wait, but it can be applied only for specified elements.
       WebDriverWait wait=new WebDriverWait(drv,30);
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("ckdmc"));

       Fluent Wait never use
       The fluent wait is used to tell the webdriver to wait for a condition, as well as the
       frequency with which we want to check the condition before throwing an "ElementNotVisibleException" exception.
       Frequency: Setting up a repeat cycle with the time frame to verify/check the condition at the regular interval of time.
       Consider a scenario where an element is loaded at different intervals of time. The element
       might load within 10 seconds, 20 seconds or even more than that if we declare an explicit
       wait of 20 seconds. It will wait till the specified time before throwing an exception. In
       such scenarios, the fluentwait is the ideal wait to use as this will try to find the element at
       different frequencies until it finds it or the final timer runs out.
       Wait wait = new FluentWait(WebDriver reference)
       wait.withTimeout(Duration.ofSeconds(30));
       wait.pollingEvery(Duration.ofSeconds(1));
       wait.ignoring(NoSuchElementException.class);

       How to pause a test execution for 5 seconds at a specific point?
       Thread.sleep(5000);

       How To Perform Right Click in Selenium WebDriver? Double Click? Hover over ona web element? Drag And Drop?
       What operations can you do using Actions class?

       Using action class we can perform all of these operations
       Actions action = new Actions(driver);
       WebElement element=driver.findElement(By.linkText("TEST"));

       //Double click
       action.doubleClick(element).perform();

      //Mouse over
      action.moveToElement(element).perform();

      //Right Click
      action.contextClick(element).perform();

      //Drag and Drop
      WebElement element = driver.findElement(By.name("source"));
      WebElement target = driver.findElement(By.name("target"));
      action.dragAndDrop(element, target).perform();

      We can perform following operation using action class:
      ● click (): Simply click on element
      ● doubleClick (): Double clicks on Element
      ● contextClick() : Perform a context-click (right click) on an element
      ● clickAndHold(): Clicks at the present mouse location (without releasing)
      ● dragAndDrop(source, target): Invokes click-and-hold at the source location and
      moves to the location of the target element before releasing the mouse. source –
      element to grab, target – element to release

      How to handle hidden elements in Selenium WebDriver? Is there a way to click hidden LINK in WebDriver?
      First store that element in object, let's say element and then write the following code to click on that hidden element
      WebElement element=”property of element”;

      JavascriptExecutor js = (JavascriptExecutor)driver;
      js.executeScript("arguments[0].click();", element);

      How to input text in the text box using Selenium WebDriver? How to input text in the text box without calling the sendKeys()?

      we can input text using sendkeys
      WebElement email = driver.findElement(By.id("email"));
      email.sendKeys("your@email.here");

      as well as
      JavascriptExecutor executor = (JavascriptExecutor)driver;
      executor.executeScript("document.getElementById("email").value='your@email.he
      re';);

      How To Scroll Web Page Down Or Up Using Selenium WebDriver?
      We use JavascriptExecutor
      //to perform Scroll Up on application using Selenium
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0,250)");

      //to perform Scroll Down on application using Selenium
      JavascriptExecutor js = (JavascriptExecutor) driver;
      js.executeScript("window.scrollBy(0, -400)");

      //to scroll an application to specified elements
      JavascriptExecutor je = (JavascriptExecutor) driver;
      je.executeScript("arguments[0].scrollIntoView(true);",element);

      How to press the ENTER key on a text box In Selenium WebDriver? How to press the TAB key in Selenium?
      NOT THAT USEEEEE
      driver.findElement(By.id("Value")).sendKeys(Keys.RETURN); or
      driver.findElement(By.id("Value")).sendKeys(Keys.ENTER); or
      driver.findElement(By.id("Value")).sendKeys(Keys.TAB);

      How do you handle the calendar elements? WebTables?
      Step 1- Click on calendar
      Step 2- Locate the month and get text
      Step 3- If the text not visible, keep click on next
      Step 4- uas soon desire month appear, grab all cells from table and loop through those cells
      Step 5- Once the cell value is match with your condition , click on matched date and break the loop

      public class CalendarHandling {
      public static void main(String[] args) {
      System.setProperty("webdriver.firefox.marionette","G:\\Selenium\\Firefoxdriver\\geckodriver.exe");
      WebDriver driver=new FirefoxDriver();
      driver.get(“URL)
      driver.findElement(By.id("datepicker")).click();
      List<WebElement>
      allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));
      for(WebElement ele:allDates) {
      String date=ele.getText();
      if (date.equalsIgnoreCase("28")) {
      ele.click();
      break;
}
}

}
      WebTable
     List<WebElement> row=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
     for (int i = 1; i <=rows.size(); i++) {
     String rowData = rows.get(i).getText();
     if (rowData.contains(ID)) {
     driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+ i +"]/td[1]/input")).click();

     break;
}
}
     How to capture Screenshot in Selenium WebDriver?
     We use TakeScreenShot interface to capture screenshot
     //Step 1. Convert web driver object to TakeScreenshot
     TakesScreenshot scrShot =((TakesScreenshot)webdriver);

     //Step 2. Call getScreenshotAs method to create image file
     File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

     //Step 3. Move image file to new destination
     File DestFile=new File(fileWithPath);

    //Step 4. Copy file at destination
    FileUtils.copyFile(SrcFile, DestFile);

    What are the different exceptions you have faced in Selenium WebDriver? What is
    StaleElementReferenceException? Have you encountered it ever and how you handled it?
    ● ElementNotVisibleException
    ● NoSuchElementException
    ● NoSuchFrameException
    ● NoAlertPresentException
    ● NoSuchWindowException
    ● StaleElementReferenceException - One of the worst exceptions for an automation engineer. WebDriver throws this
    exception when the element is in the DOM and even visible on the screen but you can’t access the element
    as a DOM reference change or element is no longer attached to the DOM.
    Solution: 1. We could refresh the page and try again for the same element.
    2. Wait for the element till it gets available
    wait.until(ExpectedConditions.presenceOfElementLocated(By.id("table")));

    How can you find Broken Links/Images in a page using Selenium WebDriver?
    Broken links are links or URLs that are not reachable. They may be down or not
    functioning due to some server error. To find broken links using selenium it means we
    need to check the link which is pointing to the wrong URL or invalid URL.
    An URL will always have a status with 2xx which is valid. There are different HTTP
    status codes which are having different purposes. For an invalid request, HTTP status is
    4xx and 5xx.
    Some of the HTTP status codes:
    200 – Valid Link
    404 – Link not found
    400 – Bad request
    401 – Unauthorized
    500 – Internal Error
    While doing validation you only have to verify status
    200- Success- ok

    INSPECT THE PAGE /RIGHT CLICK/FIND NETWORK/LOOK FOR STATUS CODE

    Have you done any cross browser testing within your Project?
    Yes I have done cross browser testing in my framework using 3 browser initialization.
    Chrome , IE and Firefox testing using Webdriver. In our property file we store keys for
    the browser and everytime we change the value of the key execution will be happening
    on different browsers.

    How to Upload a file in Selenium WebDriver? How to Download a file in Selenium WebDriver?
    sendKeys() method on the file-select input field to enter the path to the file to be uploaded ...
    WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

    // enter the file path onto the file-selection input field
    uploadElement.sendKeys("C:\\newhtml.html");
    To upload or download files in Selenium we can use Robot Class or get help from AutoIT or Sikuli
    AutoIt is just another automation tool like Selenium but unlike Selenium it is used for
    Desktop Automation rather Web Automation.
    Robot Class is a Java based class that can simulate keyboard events in Selenium.

    How To Login Into Any Site If It Is Showing Any Authentication Pop-Up for a Username And Password?
    To do this we pass username and password with the URL
    http://username:password@url
    e.g. http://myUserName:myPassword@gmail.com
    Testing URL: http://abcdatabase.com/basicauth
    Code: driver.get("http://test:test@abcdatabase.com/basicauth");

    What is the page object model ? What are the advantages of Page Object Model?
    Page Object Model is a design pattern which has become popular in test automation for
    enhancing test maintenance and reducing code duplication.
    Advantages of Page Object Model:
    ● Code reusability – We could achieve code reusability by writing the code once
    and use it in different tests.
    ● Code maintainability – There is a clean separation between test code and page
    specific code such as locators and layout which becomes very easy to maintain
    code. Code changes only on Page Object Classes when a UI change occurs. It
    enhances test maintenance and reduces code duplication.
    ● Object Repository – Each page will be defined as a java class. All the fields in the
    page will be defined in an interface as members. The class will then implement
    the interface.
    ● Readability – Improves readability due to clean separation between test code and
    page specific code.

     What is the difference between POM and PageFactory?
    A Page Object Model is a test design pattern which says organize page objects as per
    pages in such a way that scripts and page objects can be differentiated easily. A Page
    Factory is one way of implementing Page Object Model which is inbuilt in selenium.
    In plain POM, you define locators using ‘By’ while in Page Factory, you use @FindBy
    annotation to define page objects.
    Page Object Model is a design approach while PageFactory is a class which provides
    implementation of Page Object Model design approach.
    In the plain page object model, you need to initialize every page object individually
    otherwise you will encounter NullPointerException while In PageFactory all page objects
    are initialized (Lazily) by using initElements() method.
    Example from our framework:
    @FindBy(name="txtPassword")
    public WebElement password;

    public LoginPageElements() {
    PageFactory.initElements(BaseClass.driver, this);
}




















































     */

}
