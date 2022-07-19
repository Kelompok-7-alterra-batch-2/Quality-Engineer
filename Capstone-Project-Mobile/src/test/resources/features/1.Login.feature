Feature: Login
  As an User
  I want to success login
  So that I can see my dashboard page

#mvn clean verify -Dtags="@LoginScenario"
  @LoginScenario
  Scenario Outline: Log in Scenario
    Given I am on the login page
    When I input "<email>" email
    And I tap show password icon and input "<password>" password
    And I tap hide password icon and tap sign in button
    Then I get the "<result>"
    Examples:
      |email            |password |result|
      |oscar            |Oscar123!|Please enter a valid email address|
      |oscarok@gmail.com|test1234 |Please enter valid password!|
      |oscarok@gmail.com|Oscar    |Password must be at least 8 characters in length|
      |                 |Oscar123!|Please enter your email|
      |oscarok@gmail.com|         |Please enter your password|
      |mail@gmail.com   |Email123!|User Not Found!|
      |stone@yahoo.com  |Stone1234!|Only Doctor can use tablet version!|
      |oscarok@gmail.com|Oscar123!|dashboard page|

#mvn clean verify -Dtags="@LogOutScenario"
  @LogOutScenario
  Scenario: Log Out Scenario
    Given I am at the Dashboard page
    When I click sidebar button
    And I click logout sidebar menu
    Then I am on the login page
    And I login again for next test