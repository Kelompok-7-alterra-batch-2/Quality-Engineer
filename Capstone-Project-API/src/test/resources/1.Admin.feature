Feature: Admin

#mvn clean verify -Dtags="@GetAllUsers"
  @GetAllUsers
  Scenario: GET - Get All Users
    Given I set an endpoint for GET All Users
    When I request GET All Users
    Then I validate GET All Users status code is 200

#mvn clean verify -Dtags="@GetAllAdmins"
  @GetAllAdmins
  Scenario: GET - Get All Admins
    Given I set an endpoint for GET All Admins
    When I request GET All Admins
    Then I validate GET All Admins status code is 200

#mvn clean verify -Dtags="@GetExistingAdminByID"
  @GetExistingAdminByID
  Scenario: GET - Get Existing Admin By ID
    Given I set an endpoint for GET Existing Admin By ID
    When I request GET Existing Admin By ID
    Then I validate GET Existing Admin By ID status code is 200

#mvn clean verify -Dtags="@GetNonExistingAdminByID"
  @GetNonExistingAdminByID
  Scenario: GET - Get NonExisting Admin By ID
    Given I set an endpoint for GET NonExisting Admin By ID
    When I request GET NonExisting Admin By ID
    Then I validate GET NonExisting Admin By ID status code is 200

#mvn clean verify -Dtags="@CreateAdmin"
  @CreateAdmin
  Scenario Outline: POST - Create Admin
    Given I set an endpoint for POST new admin with "<name>","<dob>","<password>"and"<email>"
    When I request POST new admin
    Then I validate new admin status code is <status_code>
    Examples:
      |name|dob|password|email|status_code|
      |kaka|2002-06-07|1234|mail@gmail.com|200|
      |null|2002-06-07|1234|mail@gmail.com|500|
      |kaka|null      |1234|mail@gmail.com|500|
      |kaka|2002-06-07|null|mail@gmail.com|500|
      |kaka|2002-06-07|1234|null          |500|

#mvn clean verify -Dtags="@UpdateExistingAdmin"
  @UpdateExistingAdmin
  Scenario Outline: PUT - Update Existing Admin
    Given I set an endpoint for PUT update existing admin with "<name>","<dob>","<password>"and"<email>"
    When I request PUT update existing admin
    Then I validate update existing admin status code is <status_code>
    Examples:
      |name|dob|password|email|status_code|
      |adik|2002-06-08|5678|mail@yahoo.com|200|
      |null|2002-06-08|5678|mail@yahoo.com|500|
      |adik|null      |5678|mail@yahoo.com|500|
      |adik|2002-06-08|null|mail@yahoo.com|500|
      |adik|2002-06-08|5678|null          |500|

#mvn clean verify -Dtags="@UpdateNonExistingAdmin"
  @UpdateNonExistingAdmin
  Scenario Outline: PUT - Update NonExisting Admin
    Given I set an endpoint for PUT update nonexisting admin with "<name>","<dob>","<password>"and"<email>"
    When I request PUT update nonexisting admin
    Then I validate update nonexisting admin status code is <status_code>
    Examples:
      |name|dob|password|email|status_code|
      |adik|2002-06-08|5678|mail@yahoo.com|500|
      |null|2002-06-08|5678|mail@yahoo.com|500|
      |adik|null      |5678|mail@yahoo.com|500|
      |adik|2002-06-08|null|mail@yahoo.com|500|
      |adik|2002-06-08|5678|null          |500|

#mvn clean verify -Dtags="@DeleteExistingAdminByID"
  @DeleteExistingAdminByID
  Scenario: DELETE - Delete Existing Admin By ID
    Given I set an endpoint for DELETE Existing Admin By ID
    When I request DELETE Existing Admin By ID
    Then I validate DELETE Existing Admin By ID status code is 200

#mvn clean verify -Dtags="@DeleteNonExistingAdminByID"
  @DeleteNonExistingAdminByID
  Scenario: DELETE - Delete NonExisting Admin By ID
    Given I set an endpoint for DELETE NonExisting Admin By ID
    When I request DELETE NonExisting Admin By ID
    Then I validate DELETE NonExisting Admin By ID status code is 500