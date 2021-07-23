package JavaReview2021;

public class Cucumber {
/*

Cucumber is a tool used to run automated acceptance tests created in a BDD format.
BDD exactly means explaining the customer requirement in plain english by using Gherkin language.

TestNG is a testing framework where you specify test classes that need to be executed.

How did you use cucumber in your framework?
Main components of cucumber are step definitions and feature files. Feature files will
have test cases which are written in Gherkin Language using Given When Then.
.feature is the extension of a feature file. Example, “AddEmployee.feature” .

 Step definitions consist of an actual automation code written using Selenium and Java. All
the Step Definitions are stored in a separate folder with naming convention as
src/test/java and all the feature files are stored in a separate folder with naming
convention as src/test/resources.

And then we will have a TestRunner class that uses
JUnit to run our tests. TestRunner is the starting point of test execution which gathers all
tests to be executed.


Give an example of a behavior driven test in plain text?

Feature: Defines what feature you will be testing in the tests below
Scenario: we are describing the test case here
Given: Tells the precondition of the test
When Defines actions to be taken
And: Defines additional/ continues conditions of the test
Then: States the post condition. You can say that it is the expected result of the test.
Example:
#Author: syntax team
Feature: Add Employee
Background:
Given I logged in into HRMS
And I navigated to Add Employee Page
@smoke
Scenario: Add new Employee
When I add "John", "S" and "Smith"
And I click Save
Then I see Employee has been successfully added

Name any 2 testing frameworks that can be integrated with Cucumber?
● TestNG
● Junit

 Name any two build management tools that can be integrated with Cucumber?
● Gradle
● Maven

Explain Cucumber Tags? How to run only specific scenarios? How to run multiple
scenarios with tags? How to exclude tagged scenarios?

Cucumber tags are used to organize scenarios in feature files. We can have as many tags
as we like before a scenario or feature. @ is used to represent tags. Example:
@regression, @sprint5, @payment

Tags are used to:
● Group scenarios
● Ignore scenarios from execution
● Logically group (OR & AND)

For example we are having feature file with three test cases here i want to execute only
smoke test case:
Feature: ECommerce Application Login
@SmokeTest
Scenario: Successful Login
Given This is a blank test

@RegressionTest
Scenario: UnSuccessful Login
Given This is a blank test
To execute specific tags we have to mention them in CucumberOption in our runner
class.

@Cucumber.Options(tags="@smoke ")
To execute multiple tags:

Execute all tests tagged as @smoke OR @regression
@CucumberOptions(tags = "@smoke or @regression")

Execute all tests tagged as @smoke AND @regression
@CucumberOptions(tags = "@smoke and @regression")
to skip specific tags

Execute all tests of the feature tagged as @smoke
@CucumberOptions(tags = "not @smoke")
This is AND condition, which means all the scenario tagged as @FunctionalTest but not
@SmokeTest

 What is the use of the keyword "background" in a feature file?
Background in Cucumber is used to define a step or series of steps which are common to
all the tests/scenarios in the feature file. It allows us to add some context to the scenarios
for a feature where it is defined. A Background is much like a scenario containing a
number of steps. But it runs before each and every scenario in a feature it is defined.
#Author: syntaxteam
@sprint6 @addEmployee
Feature: Add new Employee

Background:
Given user is logged with valid admin credentials
And user navigates to AddEmployeePage

@smoke
Scenario: Add Employee with first and last name
When user enters employees "John" and "Doe"
And user clicks save button
Then "John Doe" is added successfully

 Explain Cucumber Hooks? What’s Before/After hook?
Cucumber Hooks are blocks of code that can be used to run before and after the
scenarios using @before and @after. It helps us eliminate the redundant code steps that
we write for every scenario and also manages our code workflow.
Hooks is a class that must be in the same package as step definitions and hooks will not
be executed if dryRun=true.

Note: @After will take screenshots of the failed scenarios. @Before will be
executed before ‘Background’ steps in the feature


What is @CucumberOptions in test runner? List the properties of
@CucumberOptions

@CucumberOptions are used to set specific properties for our cucumber test.
Properties are:

● feature – path to feature file
● glue – path to step definition
● dryRun – boolean value – check for missing step definition
//WHEN DRYRYN=TRUE THERE IS NO EXECUTION, WILL CHECK WITCH STEPS HAS TO BE IMPLEMENTED.
● tags – used to group cucumber scenarios in the feature file
//@SMOKE @REGRESION @ AND O/ OR
● monochrome – boolean value – display console output in a readable way
//HAS TO BE ALWAYS TRUE
● plugin – What all report formats to use
//EXTENSIONS➔ “Pretty” print details in console about scenario, tags etc
/EXTENSIONS➔ "html” Generates html report in specified folder
/EXTENSIONS➔ “json” Generates json report in specified folder

What is the difference between scenario and scenario outline?

Scenario
Represents a particular functionality which is under test. By seeing the scenario, the user
should be able to understand the intent behind the scenario and what the test is all about.

Scenario Outline
Used to execute scenarios multiple times using a different set of test data. Multiple sets of
test data are provided by using ‘Examples’ in a tabular structure separated by pipes (| |).
We can achieve data driven testing using scenario Outline
#Author: syntaxteam
@sprint6 @addEmployee
Feature: Add new Employee

Background:
Given user is logged with valid admin credentials
And user navigates to AddEmployeePage

@regression
Scenario Outline: Adding multiple employees
When user enter employees "<FirstName>", "<MiddleName>" and "<LastName>"
And user clicks save button
Then "<FirstName>", "<MiddleName>" and "<LastName>" is added successfully

Examples:
| FirstName | MiddleName | LastName |
| James | J | Smith |
| Faisal | F | Sakhi |

How can we achieve data driven testing in Cucumber? What is DataTable in
Cucumber? DataTable vs Scenario Outline?
To achieve data driven nesting in Cucumber we can use:
● Scenario Outline and Examples keyword
● DataTable

Cucumber DataTables lets us store data in a feature file.
There are 2 types of DataTable: with the header and without the header.

1. Cucumber DataTable without header
#Author: asel@syntaxtechs.com
Feature: Dashboard
Scenario: Dashboard menu view for admin
When user is logged with valid admin credentials
Then user see dashboard menu is displayed

| Admin | PIM | Leave | Time | Recruitment | Performance | Dashboard | Directory |

Implementation in Step Definitions
@Then("user see dashboard menu is displayed")
public void user_see_dashboard_menu_is_displayed(DataTable dashboardMenu) {
List<String> expectedMenu=dashboardMenu.asList();
List<String> actualMenu=new ArrayList<>();
for(WebElement el:dashboard.dashMenu) {
actualMenu.add(el.getText());
}
Assert.assertTrue(actualMenu.equals(expectedMenu));
}


2. Cucumber DataTable with header
Cucumber DataTable with header is always a best choice to store data parameters
#Author: syntaxteam
@sprint6 @addEmployee
Feature: Add new Employee
Background:
Given user is logged with valid admin credentials
And user navigates to AddEmployeePage
@regression
Scenario: Adding multiple employees
When user enters employee details and click on save then employee is added
| FirstName | MiddleName | LastName |
| John | J | Doe |
| Jane | J | Smith |

Implementation in Step Definitions

@When("user enters employee details and click on save then employee is added")
public void user_enters_employee_details_and_click_on_save(DataTable dataTable) {
List<Map<String, String>> addEmployeeList = dataTable.asMaps();
for (Map<String, String> map : addEmployeeList) {
String fname = map.get("FirstName");
String mname = map.get("MiddleName");
String lname = map.get("LastName");
sendText(addEmp.firstName, fname);
sendText(addEmp.middleName, mname);
sendText(addEmp.lastName, lname);
click(addEmp.saveBtn);
String actual = pdetails.profilePic.getText();
String expected = fname + " " + mname + " " + lname;
Assert.assertEquals("Employee is not added", expected, actual);
jsClick(dashboard.addEmp);
wait(5);
}
}

NOTE:Data from datatable can be retrieved as a single map (if we have only 1 line of
data) or as a List of Maps:
DataTable vs Scenario Outline

Scenario Outline:
● uses Example keyword to define the test data for the Scenario
● works for the whole test/scenario
● Cucumber automatically run the complete test the number of times equal to the
number of data in the Test Set

Data Table:
● no keyword is used to define the test data
● works only for the single step, below which it is defined
● A separate code is needed to understand the test data and then it can be run single
or multiple times but again just for the single step, not for the complete test


 When in Cucumber some test scenarios fail and now you want to run failed ones,
how would you do it?
1. Modify existing runner class
Add rerun:target/rerun.txt to your plugin
@RunWith(Cucumber.class)
@CucumberOptions(

features = "src/test/resources/features"
, glue = "com/hrms/steps"
, plugin = { "pretty",

"html:target/cucumC























 */
}
