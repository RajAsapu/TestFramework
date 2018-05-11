Feature: Book Hotel page
  Acceptance Criteria:

  Background:
    Given the application is opened
  @BookHotel
  Scenario Outline: To verify if user is able to view list of hotels and prices.
    Given the user sets the location as "<location>"
    When  the user sets the checkin date as "<checkin>"
    And   the user sets the checkout date as "<checkout>"
    And   the adult count as "<noofAdults>"
    And   the children count as "<noOfChildren>"
    And   clicks on search
    Then  the hotel details with the prices should be displayed

    Examples:
    | location                | checkin |checkout | noofAdults | noOfChildren |
    | Islamabad Marriott Hotel| today   | tomorrow | 3         | 1            |

