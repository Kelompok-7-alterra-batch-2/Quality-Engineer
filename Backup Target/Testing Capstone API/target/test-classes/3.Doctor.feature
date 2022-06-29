Feature: Doctor

#mvn clean verify -Dtags="@GetAllDoctors"
  @GetAllDoctors
  Scenario: GET - Get All Doctors
    Given I set an endpoint for GET All Doctors
    When I request GET All Doctors
    Then I validate GET All Doctors status code is 200

#mvn clean verify -Dtags="@GetExistingDoctorByID"
  @GetExistingDoctorByID
  Scenario: GET - Get Existing Doctor By ID
    Given I set an endpoint for GET Existing Doctor By ID
    When I request GET Existing Doctor By ID
    Then I validate GET Existing Doctor By ID status code is 200

#mvn clean verify -Dtags="@GetNonExistingDoctorByID"
  @GetNonExistingDoctorByID
  Scenario: GET - Get NonExisting Doctor By ID
    Given I set an endpoint for GET NonExisting Doctor By ID
    When I request GET NonExisting Doctor By ID
    Then I validate GET NonExisting Doctor By ID status code is 200