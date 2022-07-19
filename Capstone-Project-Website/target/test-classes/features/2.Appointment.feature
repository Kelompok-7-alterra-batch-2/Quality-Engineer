@Appointment
Feature: Appointment
  As an admin
  I want to see appointment page
  So that I can add, edit, delete, and filter appointment

#mvn clean verify -Dtags="@CreateRegisAppointment"
  @CreateRegisAppointment
  Scenario Outline: Create New Appointment With Registered Patient Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I input "<name>", "<date>", "<time>", "<department>", "<doctor>", "<reason>", and click "<submit>"
    Then I get New Appointment has been added "<result>"
    Examples:
      |name|date|time|department|doctor|reason|submit|result|
      |Aldi|today|0222PM|general|Michael|demam|submit|New Appointment has been added|
#      |null|today|0222PM|general|Michael|demam|submit|Field Patient is empty or not search yet|
#      |Aldi|null|0222PM|general|Michael|demam|date|Field Appointment Date is empty|
#      |Aldi|today|null|general|null|demam|time|Field Appointment Time is empty|
#      |Aldi|today|0222PM|null|null|demam|submit|Field Department is empty|
#      |Aldi|today|0222PM|general|null|demam|submit|Field Doctor is empty|
#      |Aldi|today|0222PM|general|Michael|null|submit|Field Appointment Reason is empty|

#mvn clean verify -Dtags="@CreateNewAppointmentWithInvalidAppointmentDate"
  @CreateNewAppointmentWithInvalidAppointmentDate
  Scenario: Create New Appointment With Invalid Appointment Date Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I input valid data then change date to invalid date and click submit
    Then I get result with date change to 01-01-1920

#mvn clean verify -Dtags="@CreateUnRegisAppointment"
  @CreateUnRegisAppointment
  Scenario: Create New Appointment With Unregistered Patient Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click no button
    Then I redirected to patient page

#mvn clean verify -Dtags="@CreateUnregisAppointment"
  @CancelCreateAppointment
  Scenario: Cancel Create New Appointment Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Add New Appointment
    And I click yes button
    And I click x icon
    Then I exit from Appointment form

#mvn clean verify -Dtags="@EditAppointment"
  @EditAppointment
  Scenario: Edit Existing Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click edit Appointment icon
    And I edit Appointment data and click submit
    Then I get Edit Appointment has been added result

#mvn clean verify -Dtags="@EditAppointment"
  @CancelEditAppointment
  Scenario: Cancel Edit Existing Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click edit Appointment icon
    And I click the x button
    Then I exit edit Appointment form

#mvn clean verify -Dtags="@CancelDeleteAppointment"
  @CancelDeleteAppointment
  Scenario: Cancel Delete Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click the delete Appointment icon
    And I click the Appointment cancel button
    Then I exit delete Appointment option message

#mvn clean verify -Dtags="@DeleteAppointment"
  @DeleteAppointment
  Scenario: Delete Appointment Data Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click delete Appointment icon
    And I click the Appointment delete button
    Then I validate Appointment success deleted

#mvn clean verify -Dtags="@FilterAppointmentGeneral"
  @FilterAppointmentGeneral
  Scenario: Filter Appointment General Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Appointment Department Filter Dropdown
    And I click Appointment General
    Then I validate Today Appointment only show General Department Appointment

#mvn clean verify -Dtags="@FilterAppointmentNeurology"
  @FilterAppointmentNeurology
  Scenario: Filter Appointment Neurology Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Appointment Department Filter Dropdown
    And I click Appointment Neurology
    Then I validate Today Appointment only show Neurology Department Appointment

#mvn clean verify -Dtags="@FilterAppointmentCardiology"
  @FilterAppointmentCardiology
  Scenario: Filter Appointment Cardiology Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Appointment Department Filter Dropdown
    And I click Appointment Cardiology
    Then I validate Today Appointment only show Cardiology Department Appointment

#mvn clean verify -Dtags="@FilterAppointmentPediatric"
  @FilterAppointmentPediatric
  Scenario: Filter Appointment Pediatric Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Appointment Department Filter Dropdown
    And I click Appointment Pediatric
    Then I validate Today Appointment only show Pediatric Department Appointment

#mvn clean verify -Dtags="@FilterAppointmentGynecology"
  @FilterAppointmentGynecology
  Scenario: Filter Appointment Gynecology Scenario
    Given I am on the dashboard page
    And I click menu Appointment
    When I click Appointment Department Filter Dropdown
    And I click Appointment Gynecology
    Then I validate Today Appointment only show Gynecology Department Appointment