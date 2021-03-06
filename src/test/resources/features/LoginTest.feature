Feature: Login page
  Acceptance Criteria: Valid user shall be able to login.
                      Invalid user shouldn't be able to login.

  Background:
     Given the application is opened
  @Login
  Scenario Outline: To verify that the user with valid credentials shall be able to login.
    Given the user is registered
      | username   | password  |
      | <username> | <password>|
    When  the user navigates to the login page
    And   enters the "<username>" and "<password>"
    And   checks remember me
    And   clicks on login
    Then  the user should be able to login

    Examples:
    | username            | password       |
    | user@phptravels.com | demouser       |
    | test@gmail.com      | test@gmail.com |