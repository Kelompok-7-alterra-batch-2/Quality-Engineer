@Appointment
Feature: Appointment
  As an admin
  I want see appointment page
  So that I can add, edit, delete, and search appointment
#mvn clean verify -Dtags="@Create"
  @CreateRegisAppointment
  Scenario: Create New Appointment With Registered Patient Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I input valid data Appointment and click submit
    Then I get New Appointment has been added result

  @CreateUnregisAppointment
  Scenario: Create New Appointment With Unregistered Patient Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click no button
    Then I redirected to patient page

  @CancelCreateAppointment
  Scenario: Cancel Create New Appointment Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I click x icon
    Then I exit from Appointment form
#mvn clean verify -Dtags="@EditAppointment"
  @EditAppointment
  Scenario: Edit Existing Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click edit Appointment icon
    And I edit Appointment data and click submit
    Then I get Edit Appointment has been added result

  Scenario: Cancel Edit Existing Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click edit Appointment icon
    And I click the x button
    Then I exit edit Appointment form
#mvn clean verify -Dtags="@DeleteAppointment"
  @DeleteAppointment
  Scenario: Delete Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click delete Appointment icon
    And I click the Appointment delete button
    Then I validate Appointment success deleted

  Scenario: Cancel Delete Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click the delete Appointment icon
    And I click the Appointment cancel button
    Then I exit delete Appointment option message