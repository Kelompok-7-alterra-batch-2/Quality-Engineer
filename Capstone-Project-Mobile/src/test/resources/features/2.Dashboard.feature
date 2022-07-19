Feature: Dashboard
  As an User
  I want to see dashboard page
  So that I can use my dashboard page feature

#mvn clean verify -Dtags="@SeePatientsTodayDetailAndClosePageScenario"
  @SeePatientsTodayDetailAndClosePageScenario
  Scenario: See Patients Today Detail And Close Page Scenario
    Given I am at the Dashboard page
    When I click > icon on Patients Today list
    Then I am on update patient data page
    And I click < icon on Update Patient Data form

#mvn clean verify -Dtags="@SeeMorePatientsTodayPageAndClosePageScenario"
  @SeeMorePatientsTodayPageAndClosePageScenario
  Scenario: See More Patients Today Page And Close Page Scenario
    Given I am at the Dashboard page
    When I click see more > button on Patients Today
    Then I am on patient page
    And I click < icon on Patient Page

#mvn clean verify -Dtags="@SeeFinishedConsultationDetailAndClosePageScenario"
  @SeeFinishedConsultationDetailAndClosePageScenario
  Scenario: See Finished Consultation Detail And Close Page Scenario
    Given I am at the Dashboard page
    When I click > icon on Finished Patients list
    Then I am on Finished Patients Data page
    And I click < icon on Finished Patients Data form

#mvn clean verify -Dtags="@SeeMoreFinishedConsultationPageAndClosePageScenario"
  @SeeMoreFinishedConsultationPageAndClosePageScenario
  Scenario: See More Finished Consultation Page And Close Page Scenario
    Given I am at the Dashboard page
    When I click see more > button on Finished Consultation
    Then I am on Finished Consultation Patient page
    And I click < icon on Finished Consultation Patient Page

#mvn clean verify -Dtags="@ValidateDoctorNameOnDashboardPageScenario"
  @ValidateDoctorNameOnDashboardPageScenario
  Scenario: Validate Doctor Name On Dashboard Page Scenario
    Given I am at the Dashboard page
    Then I validate doctor name on dashboard page is correct

#mvn clean verify -Dtags="@ValidateDateOnDashboardPageScenario"
  @ValidateDateOnDashboardPageScenario
  Scenario: Validate Date On Dashboard Page Scenario
    Given I am at the Dashboard page
    Then I validate date on dashboard page is correct

#mvn clean verify -Dtags="@ValidateTotalAppointmentsOnDashboardPageScenario"
  @ValidateTotalAppointmentsOnDashboardPageScenario
  Scenario: Validate Total Appointments On Dashboard Page Scenario
    Given I am at the Dashboard page
    Then I validate total appointments on dashboard page is correct