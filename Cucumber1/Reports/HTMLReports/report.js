$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/DataTable.feature");
formatter.feature({
  "name": "Test the login functionaly of OrangeHRM using Data Table",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test the valid login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter  credentials using DataTable",
  "rows": [
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.user_enter_credentials_using_DataTable(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land the Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.user_should_land_the_Homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Features/Test.feature");
formatter.feature({
  "name": "Test the login functionaly of OrangeHRM",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Test the valid login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter  \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should land the Homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test the valid login",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter  Admin and admin123",
  "keyword": "When "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.user_enter_the_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land the Homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "com.stepDefination.LoginTest.user_should_land_the_Homepage()"
});
formatter.result({
  "status": "passed"
});
});