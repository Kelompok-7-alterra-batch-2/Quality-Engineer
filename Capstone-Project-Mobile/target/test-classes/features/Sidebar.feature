Feature: Sidebar
  As an User
  I want to use sidebar
  So that I can change page

  Scenario Outline: Sidebar scenario
    Given I am on Dashboard page
    When I click sidebar button
    And I click "<menu>" menu
    Then I get the "<result>" page
    Examples:
      |menu|result|
      |dashboard|dashboard page|
      |patient|patient page|