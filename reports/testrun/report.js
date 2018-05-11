$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/asapu/Documents/TestFramework/src/test/resources/features/LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "Login page",
  "description": "Acceptance Criteria: Valid user shall be able to login.",
  "id": "login-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 7,
  "name": "To verify that the user with valid credentials shall be able to login.",
  "description": "",
  "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user is registered",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "\u003cusername\u003e",
        "\u003cpassword\u003e"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user navigates to the login page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "checks remember me",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.examples({
  "line": 17,
  "name": "",
  "description": "",
  "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 18,
      "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.;;1"
    },
    {
      "cells": [
        "user@phptravels.com",
        "demouser"
      ],
      "line": 19,
      "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.;;2"
    },
    {
      "cells": [
        "test@gmail.com",
        "test@gmail.com"
      ],
      "line": 20,
      "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.;;3"
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
  "duration": 13747687672,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "To verify that the user with valid credentials shall be able to login.",
  "description": "",
  "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user is registered",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "user@phptravels.com",
        "demouser"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user navigates to the login page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "enters the \"user@phptravels.com\" and \"demouser\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "checks remember me",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.the_user_is_registered(DataTable)"
});
formatter.result({
  "duration": 6529857,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.the_user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 3185995084,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "user@phptravels.com",
      "offset": 12
    },
    {
      "val": "demouser",
      "offset": 38
    }
  ],
  "location": "LoginPageSteps.enters_the_and(String,String)"
});
formatter.result({
  "duration": 346153847,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.checks_remember_me()"
});
formatter.result({
  "duration": 131511468,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.clicks_on_login()"
});
formatter.result({
  "duration": 115917473,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.the_user_should_be_able_to_login()"
});
formatter.result({
  "duration": 4534491622,
  "status": "passed"
});
formatter.after({
  "duration": 2524344235,
  "status": "passed"
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
  "duration": 17712511803,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "To verify that the user with valid credentials shall be able to login.",
  "description": "",
  "id": "login-page;to-verify-that-the-user-with-valid-credentials-shall-be-able-to-login.;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 6,
      "name": "@Login"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "the user is registered",
  "matchedColumns": [
    0,
    1
  ],
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 9
    },
    {
      "cells": [
        "test@gmail.com",
        "test@gmail.com"
      ],
      "line": 10
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "the user navigates to the login page",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "enters the \"test@gmail.com\" and \"test@gmail.com\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "checks remember me",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "clicks on login",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "the user should be able to login",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.the_user_is_registered(DataTable)"
});
formatter.result({
  "duration": 2457303,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.the_user_navigates_to_the_login_page()"
});
formatter.result({
  "duration": 2861699089,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@gmail.com",
      "offset": 12
    },
    {
      "val": "test@gmail.com",
      "offset": 33
    }
  ],
  "location": "LoginPageSteps.enters_the_and(String,String)"
});
formatter.result({
  "duration": 288786129,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.checks_remember_me()"
});
formatter.result({
  "duration": 132848316,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.clicks_on_login()"
});
formatter.result({
  "duration": 98016709,
  "status": "passed"
});
formatter.match({
  "location": "LoginPageSteps.the_user_should_be_able_to_login()"
});
formatter.result({
  "duration": 2007868843,
  "error_message": "com.google.common.base.VerifyException: User is not logged in\r\n\tat com.google.common.base.Verify.verify(Verify.java:122)\r\n\tat functions.login.LoginMethods.verifyLoggedIn(LoginMethods.java:44)\r\n\tat stepdefs.LoginPageSteps.the_user_should_be_able_to_login(LoginPageSteps.java:50)\r\n\tat ✽.Then the user should be able to login(C:/Users/asapu/Documents/TestFramework/src/test/resources/features/LoginTest.feature:15)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 579651086,
  "status": "passed"
});
});