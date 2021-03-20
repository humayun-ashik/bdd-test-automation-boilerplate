$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "In order to do internet banking\r\nAs a valid Para Bank customer\r\nI want to login successfully",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Login Successful",
  "description": "",
  "id": "login-functionality;login-successful",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I am in the login page of the Para Bank Application",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should be taken to the Overview page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.i_am_in_the_login_page_of_the_Para_Bank_Application()"
});
formatter.result({
  "duration": 9553745000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_enter_valid_credentials()"
});
formatter.result({
  "duration": 2956474700,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.i_should_be_taken_to_the_Overview_page()"
});
formatter.result({
  "duration": 1996770400,
  "status": "passed"
});
});