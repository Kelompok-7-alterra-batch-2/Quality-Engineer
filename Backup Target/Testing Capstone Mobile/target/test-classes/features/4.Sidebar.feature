Feature: Sidebar
  As an User
  I want to use sidebar
  So that I can change page

#mvn clean verify -Dtags="@SidebarScenario"
  @SidebarScenario
  Scenario Outline: Sidebar Scenario
    Given I am on Dashboard page
    When I click sidebar button
    And I click "<menu>" menu
    Then I get the "<result>" page
    Examples:
      |menu|result|
      |dashboard|dashboard page|
      |patient|patient page|