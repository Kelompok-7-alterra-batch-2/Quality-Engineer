@Dashboard
Feature: Dashboard
  As an admin
  I want to see dashboard page
  So that I can use dashboard feature

#mvn clean verify -Dtags="@ValidateDateOnDashboardPageScenario"
  @ValidateDateOnDashboardPageScenario
  Scenario: Validate Date On Dashboard Page Scenario
    Given I am on the dashboard page
    Then I validate date on dashboard page

#mvn clean verify -Dtags="@ClickAppointmentsButton"
  @ClickAppointmentsButton
  Scenario: Click Appointments Button Scenario
    Given I am on the dashboard page
    When I click dashboard appointments button
    Then I get redirect to appointments page

#mvn clean verify -Dtags="@ClickDoctorsButton"
  @ClickDoctorsButton
  Scenario: Click Doctors Button Scenario
    Given I am on the dashboard page
    When I click dashboard doctors button
    Then I get redirect to doctor page

#mvn clean verify -Dtags="@ClickPatientsButton"
  @ClickPatientsButton
  Scenario: Click Patients Button Scenario
    Given I am on the dashboard page
    When I click dashboard patients button
    Then I get redirect to patient page