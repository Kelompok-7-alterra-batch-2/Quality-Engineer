@Dashboard
Feature: Dashboard
  As an admin
  I want use dashboard
  So that I can edit dashboard page
#mvn clean verify -Dtags="@DDT"
  @Edit
  Scenario: Edit scenario
    Given I am on the dashboard page
    When I click edit button
    Then I get the result

  Scenario: Cancel Edit scenario
    Given I am on the dashboard page
    When I click edit button
    Then I get the result
    And I click cancel

  @Delete
  Scenario Outline: delete scenario
    Given I am on the dashboard page
    When I click delete button
    And I get the popup
    Then I click "<button>" button
    And I get "<result>"
    Examples:
      |button|result|
      |delete|Row has been deleted|
      |cancel|Appointment's Today|