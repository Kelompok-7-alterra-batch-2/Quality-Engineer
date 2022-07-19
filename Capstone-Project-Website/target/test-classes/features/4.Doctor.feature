#@Doctor
#Feature: Doctor
#  As an admin
#  I want to see doctor page
#  So that I can add, edit, delete, search, and filter doctor
#
##mvn clean verify -Dtags="@CreateDoctor"
#  @CreateDoctor
#  Scenario: Create New Doctor Scenario
#    Given I'am at the dashboard page
#    And I click menu doctor
#    When I click Add New Doctor
#    And I input valid data doctor and click submit
#    Then I get New Doctor has been added result
#
##mvn clean verify -Dtags="@CancelCreateDoctor"
#  @CancelCreateDoctor
#  Scenario: Cancel Create New Doctor Scenario
#    Given I'am at the dashboard page
#    And I click menu doctor
#    When I click Add New Doctor
#    Then I click new doctor form x button
#
##mvn clean verify -Dtags="@EditDoctor"
#  @EditDoctor
#  Scenario: Edit Doctor Data Scenario
#    Given I'am at the dashboard page
#    And I click menu doctor
#    When I click Edit Doctor button
#    And I change doctor data
#    Then I get Edit Doctor has been added result
#
#  Scenario: Cancel Edit Doctor Data Scenario
#    Given I'am at the dashboard page
#    And I click menu doctor
#    When I click Edit Doctor button
#    Then I click Edit Doctor form x button
#
##mvn clean verify -Dtags="@CancelDeleteDoctor"
#  @CancelDeleteDoctor
#  Scenario: Cancel Delete Doctor Data Scenario
#    Given I am at the dashboard page
#    And I click menu doctor
#    When I click the Delete Doctor icon
#    Then I click Cancel button for Delete Doctor Message
#
##mvn clean verify -Dtags="@DeleteDoctor"
#  @DeleteDoctor
#  Scenario: Delete Doctor Data Scenario
#    Given I am at the dashboard page
#    And I click menu doctor
#    When I click Delete Doctor icon
#    And I click Delete button for Delete Doctor Message
#    Then I validate Doctor data is gone
#
#  @Search
#  Scenario: Search Doctor Based on Doctor NID Scenario
#    Given I am at the dashboard page
#    And I click menu doctor
#    When I input doctor NID and click search
#    Then I validate search by doctor NID
#
#  Scenario: Search Doctor Based on Doctor Department
#    Given I am at the dashboard page
#    And I click menu doctor
#    When I input doctor department and click search
#    Then I validate search by doctor Department
#
#  Scenario: Search Doctor Based on Doctor Name Scenario
#    Given I am at the dashboard page
#    And I click menu doctor
#    When I input doctor name and click search
#    Then I validate search by doctor name
#
#  Scenario: Search Doctor Based on Doctor Phone Number Scenario
#    Given I am at the dashboard page
#    And I click menu doctor
#    When I input doctor phone number and click search
#    Then I validate search by doctor phone number
#
##mvn clean verify -Dtags="@FilterDoctorGeneral"
#  @FilterDoctorGeneral
#  Scenario: Filter Doctor General Scenario
#    Given I am on the dashboard page
#    And I click menu doctor
#    When I click doctor department filter dropdown
#    And I click general menu
#    Then I validate doctor list only show general department doctor
#
#  @FilterDoctorNeurology
#  Scenario: Filter Doctor Neurology Scenario
#    Given I am on the dashboard page
#    And I click menu doctor
#    When I click doctor department filter dropdown
#    And I click neurology menu
#    Then I validate doctor list only show neurology department doctor
#
#  @FilterDoctorCardiology
#  Scenario: Filter Doctor Cardiology Scenario
#    Given I am on the dashboard page
#    And I click menu doctor
#    When I click doctor department filter dropdown
#    And I click cardiology menu
#    Then I validate doctor list only show cardiology department doctor
#
#  @FilterDoctorPediatric
#  Scenario: Filter Doctor Pediatric Scenario
#    Given I am on the dashboard page
#    And I click menu doctor
#    When I click doctor department filter dropdown
#    And I click pediatric menu
#    Then I validate doctor list only show pediatric department doctor
#
#  @FilterDoctorGynecology
#  Scenario: Filter Doctor Gynecology Scenario
#    Given I am on the dashboard page
#    And I click menu doctor
#    When I click doctor department filter dropdown
#    And I click gynecology menu
#    Then I validate doctor list only show gynecology department doctor