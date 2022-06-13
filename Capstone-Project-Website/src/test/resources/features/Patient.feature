@Patient
Feature: Patient
  As an admin
  I want see patient page
  So that I can add, edit, and delete patient
#mvn clean verify -Dtags="@DDT"
  @Create
  Scenario: Create New Patient scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Add New Patient
    And I input valid data patient and click submit
    Then I get New Patient has been added result

  Scenario: Edit Patient Data scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Edit Patient button
    And I change patient data
    Then I get Edit Patient has been added result

  Scenario: Cancel Edit Patient Data scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Edit Patient button
    Then I click x button

  Scenario: Delete Patient Data scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Delete Patient button
    Then I click Delete button

  Scenario: Cancel Delete Patient Data scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click the Delete Patient button
    Then I click Cancel button