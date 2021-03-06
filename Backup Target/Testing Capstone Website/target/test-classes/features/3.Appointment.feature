@Appointment
Feature: Appointment
  As an admin
  I want see appointment page
  So that I can add, edit, delete, and search appointment
#mvn clean verify -Dtags="@DDT"
  @Create
  Scenario: Create New Appointment scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I input valid data Appointment and click submit
    Then I get New Appointment has been added result

  Scenario: Cancel Create New Appointment scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I click x icon
    Then I exit from Appointment form

  Scenario: Edit Existing Appointment Data scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click edit Appointment icon
    And I edit Appointment data and click submit
    Then I get Edit Appointment has been added result

  Scenario: Cancel Edit Existing Appointment Data scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click edit Appointment icon
    And I click the x button
    Then I exit edit Appointment form

  Scenario: Delete Appointment Data
    Given I am on the dashboard page
    And I click menu Appointment
    When I click delete Appointment icon
    And I click the Appointment delete button
    Then I validate Appointment success deleted