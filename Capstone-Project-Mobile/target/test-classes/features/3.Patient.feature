Feature: Patient
  As an User
  I want to see Patient page
  So that I can see Patient list

  Scenario: Click back on Patient page scenario
    Given I am on the Dashboard page
    When I click the sidebar button
    And I click patient sidebar menu
    And I click back button on patient page
    Then I am back to Dashboard page