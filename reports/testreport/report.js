$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("BookHotel.feature");
formatter.feature({
  "line": 1,
  "name": "Book Hotel page",
  "description": "Acceptance Criteria:",
  "id": "book-hotel-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "To verify if user is able to view list of hotels and prices.",
  "description": "",
  "id": "book-hotel-page;to-verify-if-user-is-able-to-view-list-of-hotels-and-prices.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user sets the location as \"\u003clocation\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user sets the checkin date as \"\u003ccheckin\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user sets the checkout date as \"\u003ccheckout\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the adult count as \"\u003cnoofAdults\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the children count as \"\u003cnoOfChildren\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on search",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the hotel details with the prices should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "book-hotel-page;to-verify-if-user-is-able-to-view-list-of-hotels-and-prices.;",
  "rows": [
    {
      "cells": [
        "location",
        "checkin",
        "checkout",
        "noofAdults",
        "noOfChildren"
      ],
      "line": 17,
      "id": "book-hotel-page;to-verify-if-user-is-able-to-view-list-of-hotels-and-prices.;;1"
    },
    {
      "cells": [
        "Islamabad Marriott Hotel",
        "today",
        "tomorrow",
        "3",
        "1"
      ],
      "line": 18,
      "id": "book-hotel-page;to-verify-if-user-is-able-to-view-list-of-hotels-and-prices.;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "the application is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonSteps.the_application_is_opened()"
});
formatter.result({
  "duration": 21337171818,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "To verify if user is able to view list of hotels and prices.",
  "description": "",
  "id": "book-hotel-page;to-verify-if-user-is-able-to-view-list-of-hotels-and-prices.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@BookHotel"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user sets the location as \"Islamabad Marriott Hotel\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "the user sets the checkin date as \"today\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the user sets the checkout date as \"tomorrow\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "the adult count as \"3\"",
  "matchedColumns": [
    3
  ],
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "the children count as \"1\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "clicks on search",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "the hotel details with the prices should be displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Islamabad Marriott Hotel",
      "offset": 31
    }
  ],
  "location": "BookHotelSteps.the_user_sets_the_location_as(String)"
});
formatter.result({
  "duration": 1567046396,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "today",
      "offset": 35
    }
  ],
  "location": "BookHotelSteps.the_user_sets_the_checkin_date_as(String)"
});
formatter.result({
  "duration": 177980838,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "tomorrow",
      "offset": 36
    }
  ],
  "location": "BookHotelSteps.the_user_sets_the_checkout_date_as(String)"
});
formatter.result({
  "duration": 154727977,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 20
    }
  ],
  "location": "BookHotelSteps.the_adult_count_as(String)"
});
formatter.result({
  "duration": 132201275,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 23
    }
  ],
  "location": "BookHotelSteps.the_children_count_as(String)"
});
formatter.result({
  "duration": 116029518,
  "status": "passed"
});
formatter.match({
  "location": "BookHotelSteps.clicks_on_search()"
});
