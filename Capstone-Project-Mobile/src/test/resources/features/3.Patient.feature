Feature: Patient
  As an User
  I want to see Patient page
  So that I can see Patient list

#mvn clean verify -Dtags="@TapTheBackIconOnThePatientPageScenario"
  @TapTheBackIconOnThePatientPageScenario
  Scenario: Tap The Back Icon On The Patient Page Scenario
    Given I am on the Dashboard page
    When I click the sidebar button
    And I click patient sidebar menu
    And I click back button on patient page
    Then I am back to Dashboard page

#mvn clean verify -Dtags="@SearchPatientByPatientNameScenario"
  @SearchPatientByPatientNameScenario
  Scenario: Search Patient By Patient Name Scenario
    Given I am on the Dashboard page
    When I click the sidebar button
    And I click patient sidebar menu
    And I tap the search field at Patient Page
    And I input patient name and tap the search button
    Then I get result inputed patient name appear

#mvn clean verify -Dtags="@SeeUpdatePatientDataPageScenario"
  @SeeUpdatePatientDataPageScenario
  Scenario: See Update Patient Data Page Scenario
    Given I am on the Dashboard page
    When I click the sidebar button
    And I click patient sidebar menu
    And I tap the > icon on Patient Page patient
    Then I am on the Update Patient Data page

##mvn clean verify -Dtags="@UpdatePatientDataScenario"
#  @UpdatePatientDataScenario
#  Scenario Outline: Update and Cancel Patient Data Scenario
#    Given I am on the Dashboard page
#    And I click the sidebar button
#    And I click patient sidebar menu
#    And I tap the > icon on Patient Page patient
#    And I scroll to "<bottom>"
#    When I input "<diagnosis>" Diagnosis
#    And I input "<prescription>" Prescription
#    And I tap "<submit>" submit button
#    Then I get update patient "<result>"
#    Examples:
#      |bottom|diagnosis|prescription|submit|result|
#      |Prescription|        |        |Warning|Update Patient Data|
#      |Prescription|Poisoned|        |Warning|Update Patient Data|
#      |Prescription|        |Antidote|Warning|Update Patient Data|
#      |Prescription|Poisoned|Antidote|Cancel|Update Patient Data|
#      |Prescription|Poisoned|Antidote|Confirm|Finished Consultation|