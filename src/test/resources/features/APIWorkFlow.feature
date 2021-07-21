Feature: Syntax HRMS API Workflow
  Description: This feature files tests Syntax HRMS API Workflow

  @APIWorkflow
  Scenario: Creating an Employee
    Given a request is prepared to create an employee
    When a POST call is made to create an employee
    Then the status code for creating an employee is 201
    And the employee created contains key "Message" and value "Entry Created"
    And the employeeID "" is stored as a global variable to be used for other calls
