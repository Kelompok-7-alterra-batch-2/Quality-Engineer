@Patient
Feature: Patient
  As an admin
  I want to see patient page
  So that I can add, edit, delete, and search patient

#mvn clean verify -Dtags="@CreateNewPatientScenario"
  @CreateNewPatientScenario
  Scenario: Create New Patient Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Add New Patient
    And I input valid data patient and click submit
    Then I get New Patient has been added result

#mvn clean verify -Dtags="@CancelCreateNewPatientScenario"
  @CancelCreateNewPatientScenario
  Scenario: Cancel Create New Patient Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Add New Patient
    Then I click new patient form x button

#mvn clean verify -Dtags="@EditPatientDataScenario"
  @EditPatientDataScenario
  Scenario: Edit Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Edit Patient button
    And I change patient data
    Then I get Edit Patient has been added result

#mvn clean verify -Dtags="@CancelEditPatientDataScenario"
  @CancelEditPatientDataScenario
  Scenario: Cancel Edit Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Edit Patient button
    Then I click x button

#mvn clean verify -Dtags="@CancelDeletePatientDataScenario"
  @CancelDeletePatientDataScenario
  Scenario: Cancel Delete Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click the Delete Patient button
    Then I click Cancel button

#mvn clean verify -Dtags="@DeletePatientDataScenario"
  @DeletePatientDataScenario
  Scenario: Delete Patient Data Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I click Delete Patient button
    Then I click Delete button

#mvn clean verify -Dtags="@SearchPatientBasedOnPatientNameScenario"
  @SearchPatientBasedOnPatientNameScenario
  Scenario: Search Patient Based On Patient Name Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient name and click search
    Then I validate search by patient name

#mvn clean verify -Dtags="@SearchPatientBasedOnPatientDateOfBirthScenario"
  @SearchPatientBasedOnPatientDateOfBirthScenario
  Scenario: Search Patient Based On Patient Date Of Birth Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient date of birth and click search
    Then I validate search by patient date of birth

#mvn clean verify -Dtags="@SearchPatientBasedOnPatientGenderScenario"
  @SearchPatientBasedOnPatientGenderScenario
  Scenario: Search Patient Based On Patient Gender Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient gender and click search
    Then I validate search by patient gender

#mvn clean verify -Dtags="@SearchPatientBasedOnPatientBloodTypeScenario"
  @SearchPatientBasedOnPatientBloodTypeScenario
  Scenario: Search Patient Based On Patient Blood Type Scenario
    Given I am at the dashboard page
    And I click menu patient
    When I input patient blood type and click search
    Then I validate search by patient blood type