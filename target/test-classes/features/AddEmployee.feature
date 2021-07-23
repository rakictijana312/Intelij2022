Feature: Adding employees

  Background:
    And user is logged in with valid admin credentials
    When user clicks on PIM option
    And user clicks on Add employee button

  @smoke
  Scenario: Adding employee from add employee page
    And user enters firstname middlename and lastname
    And user clicks on save button option
    Then employee added successfully

  @smoke
  Scenario: Adding employee from add employee page via feature file
    And user enters first name "Yulia123" middle name "MS" and last name "Yulia456"
    And user clicks on save button option
    Then employee added successfully

  @example
  Scenario Outline: Adding employee from add employee page via feature file
    And user enters "<FirstName>" "<MiddleName>" and "<LastName>" in the application
    And user clicks on save button option
    Then employee added successfully

    Examples:
      | FirstName  | MiddleName | LastName |
      | Test123456 | MS         | Test9876 |
      | Test1212   | MS         | Test7654 |
      | Test3232   | MS         | Test5454 |

  @datatablewithheader
  Scenario: Adding multiple employees in a single execution
    When add multiple employees and verify they are added successfully
      | FirstName | MiddleName | LastName |
      | Jon0404   | MS         | US       |
      | Jack0404  | MS         | US       |
      | MS0909    | MS         | US       |

  @excel
  Scenario: Adding the employee from excel file
    When user adds multiple employees from excel file from "newdata" sheet and verify they are added
  @db @regression
  Scenario: Adding employee and Database testing
    When user enters first name "Yulia123" middle name "MS" and last name "Yulia456"
    And capture employeeId
    And user clicks on save button option
    Then query the HRMS database
    And verify data from frontend and backend is same

    @db
    Scenario: Add the employee and testing it from the backend
      When user enters first name "Yulia123" middle name "MS" and last name "Yulia456"
      And capture the employeeId
      And user clicks on save button option
      Then query the HRMS database
      And verify the data from frontend and backend


