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

#mvn clean verify -Dtags="@CreateDoctor"
  @CreateDoctor
  Scenario Outline: POST - Create Doctor
    Given I set an endpoint for POST new doctor
    When I request POST new doctor with "<name>","<dob>","<password>","<email>","<availableFrom>","<availableTo>","<department_id>"
    Then I validate new doctor status code is <status_code>
    Examples:
      |name|dob|password|email|availableFrom|availableTo|department_id|status_code|
      |kaka|2002-06-07|1234|mail@gmail.com|12:12:12|06:06:06|1|200|
      |null|2002-06-07|1234|mail@gmail.com|12:12:12|06:06:06|1|500|
      |kaka|null      |1234|mail@gmail.com|12:12:12|06:06:06|1|500|
      |kaka|2002-06-07|null|mail@gmail.com|12:12:12|06:06:06|1|500|
      |kaka|2002-06-07|1234|null          |12:12:12|06:06:06|1|500|
      |kaka|2002-06-07|1234|mail@gmail.com|null    |06:06:06|1|500|
      |kaka|2002-06-07|1234|mail@gmail.com|12:12:12|null    |1|500|
      |kaka|2002-06-07|1234|mail@gmail.com|12:12:12|06:06:06|null|500|