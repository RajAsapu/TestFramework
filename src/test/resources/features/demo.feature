Feature: To test the gmail login page
  AC:

  Scenario: To verify if the user is able to login into gmail.
    Given the user has lauched the gmail login page
    When  the user enters login details
    | username       | password       |
    | abhi@gmail.com | abhi@gmail.com |
    And  the user clicks on login
    Then the user shall be able to view the gmail home page