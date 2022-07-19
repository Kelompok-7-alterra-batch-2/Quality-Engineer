#@Appointment
#Feature: Appointment
#  As an admin
#  I want to see appointment page
#  So that I can add, edit, delete, and filter appointment
#
##mvn clean verify -Dtags="@CreateRegisAppointment"
#  @CreateRegisAppointment
#  Scenario Outline: Create New Appointment With Registered Patient Scenario
#    Given I am on the dashboard page
#    And I click menu Appointment
#    When I click Add New Appointment
#    And I click yes button
#    And I input "<name>", "<date>", "<time>", "<department>", "<doctor>", "<reason>", and click "<submit>"
#    Then I get New Appointment has been added "<result>"
#    Examples:
#      |name|date|time|department|doctor|reason|submit|result|
#      |Aldi|today|0222PM|general|Michael|demam|submit|New Appointment has been added|
#      |null|today|0222PM|general|Michael|demam|submit|Field Patient is empty or not search yet|
#      |Aldi|null|0222PM|general|Michael|demam|date|Field Appointment Date is empty|
#      |Aldi|today|null|general|null|demam|time|Field Appointment Time is empty|
#      |Aldi|today|0222PM|null|null|demam|submit|Field Department is empty|
#      |Aldi|today|0222PM|general|null|demam|submit|Field Doctor is empty|
#      |Aldi|today|0222PM|general|Michael|null|submit|Field Appointment Reason is empty|