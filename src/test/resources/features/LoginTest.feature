Feature: Login page
  Acceptance Criteria: Valid user shall be able to login.

  Background:
     Given the application is opened

  Scenario Outline: To verify that the user with valid credentials shall be able to login.
    Given the user is registered
      | username   | password  |
      | user@phptravels.com | demouser       |
      | test@gmail.com      | test@gmail.com |
    When  the user navigates to the login page
    And   enters the "<username>" and "<password>"
    And   clicks on login
    Then  the user should be able to login

    Examples:
    | username            | password       |
    | user@phptravels.com | demouser       |
    | test@gmail.com      | test@gmail.com |