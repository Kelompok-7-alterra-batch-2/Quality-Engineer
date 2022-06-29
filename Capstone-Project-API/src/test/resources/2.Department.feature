Feature: Department

#mvn clean verify -Dtags="@GetAllDepartments"
  @GetAllDepartments
  Scenario: GET - Get All Departments
    Given I set an endpoint for GET All Departments
    When I request GET All Departments
    Then I validate GET All Departments status code is 200

#mvn clean verify -Dtags="@CreateDepartment"
  @CreateDepartment
  Scenario Outline: POST - Create Department
    Given I set an endpoint for POST new department with "<name>"
    When I request POST new department
    Then I validate new department status code is <status_code>
    Examples:
      |name|status_code|
      |Pediatric|200|
      |null|500|