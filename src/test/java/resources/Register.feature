Feature: Register
  In order to do internet banking
  As a valid Para Bank customer
  I want to register successfully first

  Scenario: Registration Successful
    Given I am in the home page of the Para Bank Application
    When I click Register link
    Then I should be taken to the SignUP page
    When I fill up registration info
    And I click on Register button
    Then Registration will be successful