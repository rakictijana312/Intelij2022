package JavaReview2021;

public class TellMeAboutYourFramework {

    /*

Currently I am using the Maven Cucumber framework that is followed by POM with a
page factory. My framework is hybrid and it supports both BDD and DDT, it’s built using
Java programming language. My framework supports UI, DataBase and API testing and
it is incorporated with Jenkins to support the CICD process.

MAVEN:
First, we have a Maven project that helps us build project structure, manage
project dependencies and execute automated scripts. In the pom file we add all
dependencies that are required for the project (Selenium, Cucumber, JUnit, JDBC, Rest
Assured etc ).

TEST RUNNER:
Is the execution point of our framework. In our runner class using
Cucumber options we specify configurations of our tests. We have separate smoke,
regression and API JUnit runner classes.
If DRY RUN=TRUE----test casese will not exicute.


CUCUMBER HOOKS:
Is the block of code to do test case exicutions before and after scenarios
using @Before and @After annotation we call the setup method in
our that initializes our driver and we call the method to initialize all page elements. Also
using @After hook we are taking screenshots on every failed scenario.@Before will exicute before
any background steps in feature file.

COMMON METHODS:
In this class we are extracting the value of our browser and url from
properties file and using those values doing WebDriver initialization and navigating to
specific urls (we test on different environments Test and SIT).
When data become bigger we are using excel sheets.In this we are going to describe the common reusable
function for example mouse hover, handling alerts, frames and windows, taking screenshots, explicit
waits and javascript executor.

FEATURE FILE:
here we are writing our test cases to test UI, Database and API. Our tests
are written using Gherkin syntax Given, When, Then along with Background keyword,

SCENARIO AND SCENARIO OUTLINE:
We also use tags in order to execute smoke and regression test cases.

STEP DEFINITIONS:
In this we are actually implementing our automation scripts and logic
using Selenium and Java languages and performing validations using JUnit assertions.

PAGES:
My framework is built using a POM approach to eliminate code redundancy,
improve code reusability and make it easy to maintain. In this we are storing information
about pages, it’s elements and actions that need to be performed. We are using @FindBy
annotation to locate the element and PageFactory to initialize all elements.


ExXCEL UTILITY:
In this class we store functions to open, read and extract data from Excel
DBUtility: In this class we store functions to open database connections, extract data
from database and close any open connections.


CONSTANTS:
This class holds the information which is static final in nature and remains
the same throughout the entire framework such as path to the configurations, reports and
excel files, operating system type, implicit and explicit waits.


TARGET: All cucumber Html and advanced reports will be generated successfully in the
target folder.


VERSION CONTROL: We are using GIT for storing all the scripts at a centralised repository.

JENKINS:
We are using Jenkins for Continuous Integration. We execute the test scripts on
a daily basis or whenever a code is pushed. Test scripts are also executed based on
schedule.


     */


    /*


























     */
}
