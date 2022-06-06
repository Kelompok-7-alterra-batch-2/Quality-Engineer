Feature: Login
  As an User
  I want to success login
  So that I can see my dashboard page

  Scenario Outline: Login scenario
    Given I am on the login page
    When I input "<email>" email
    And I input "<password>" password
    And I tap sign in button
    Then I get the "<result>"
    Examples:
      |email|password|result|
      |test@test.com|test12345|dashboard page|