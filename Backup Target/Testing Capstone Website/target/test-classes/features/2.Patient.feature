@Patient
Feature: Patient
  As an admin
  I want see patient page
  So that I can add, edit, and delete patient
#mvn clean verify -Dtags="@DDT"
  @Create
  Scenario: Create New Patient Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Add New Patient
    And I input valid data patient and click submit
    Then I get New Patient has been added result

  Scenario: Cancel Create New Patient Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Add New Patient
    Then I click new patient form x button

  Scenario: Edit Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Edit Patient button
    And I change patient data
    Then I get Edit Patient has been added result

  Scenario: Cancel Edit Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Edit Patient button
    Then I click x button

  Scenario: Delete Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Delete Patient button
    Then I click Delete button

  Scenario: Cancel Delete Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click the Delete Patient button
    Then I click Cancel button

  Scenario: Search Patient Based on Patient Name Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient name and click search
    Then I validate search by patient name

  Scenario: Search Patient Based on Patient Date of Birth Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient date of birth and click search
    Then I validate search by patient date of birth

  Scenario: Search Patient Based on Patient Gender Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient gender and click search
    Then I validate search by patient gender

  Scenario: Search Patient Based on Patient Blood Type Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient blood type and click search
    Then I validate search by patient blood type