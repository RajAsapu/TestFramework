Feature: Registration page
  Acceptance Criteria:

  Background:
    Given the application is opened
  @Registration
  Scenario Outline: User shall be able to register
    Given  the user navigates to the registration page
    When   the user enters details
    | firstname | lastname | mobilenumber | email | password | confirmpassword |
    |<firstname>|<lastname>|<mobilenumber>|<email>|<password>|<confirmpassword>|
    And    clicks on signup
    Then   the user should be registered

    Examples:
      | firstname | lastname | mobilenumber | email          | password       | confirmpassword |
      | raja      | aa        | 7279020202  | check@yahoo.com | check@yahoo.com | check@yahoo.com  |

