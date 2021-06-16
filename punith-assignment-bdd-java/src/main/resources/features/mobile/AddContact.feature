@mobile
Feature: Add Contact:- As a customer  I would like to add a new contact

  Scenario: Add a new contact
    Given i click on Add New Contacts Button
    When i add name email and click on Save
    Then i verify the error message "Unfortunately, Contact Manager has stopped."
    Then i click on ok button


