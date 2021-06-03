Feature: Employee Search
  Scenario: Search employee by id
    Given user navigates to hrms
    And user is logged in with valid admin credentials
    And user navigates to employee list page
    When user enters valid employee id
    And click on search button
    Then user see employee information is displayed

  Scenario: Search employee by name
    Given user navigates to hrms
    And user is logged in with valid admin credentials
    And user navigates to employee list page
    When user enters valid employee name
    And click on search button
    Then user see employee information is displayed